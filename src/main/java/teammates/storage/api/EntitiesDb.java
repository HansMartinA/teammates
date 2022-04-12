package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import com.google.common.base.Objects;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.JsonUtils;
import teammates.common.util.Logger;
import teammates.storage.entity.BaseEntity;
abstract class EntitiesDb<E extends BaseEntity, A extends EntityAttributes<E>>  {
static final String ERROR_CREATE_ENTITY_ALREADY_EXISTS = "Trying to create an entity that exists: %s";

static final String ERROR_UPDATE_NON_EXISTENT = "Trying to update non-existent Entity: ";

static final String OPTIMIZED_SAVING_POLICY_APPLIED = "Saving request is not issued because entity %s does not change by the update (%s)";

static final Logger log = Logger.getLogger();

public  A createEntity(A entityToCreate)throws InvalidParametersException, EntityAlreadyExistsException {
return createEntity(entityToCreate, true);
}

private  A createEntity(A entityToAdd, boolean shouldCheckExistence)throws InvalidParametersException, EntityAlreadyExistsException {
assert entityToAdd != null;
entityToAdd.sanitizeForSaving();
if (!entityToAdd.isValid())
{
throw new  InvalidParametersException(entityToAdd.getInvalidityInfo());
}
if (shouldCheckExistence && hasExistingEntities(entityToAdd))
{
String error = String.format(ERROR_CREATE_ENTITY_ALREADY_EXISTS, entityToAdd.toString());
throw new  EntityAlreadyExistsException(error);
}
E entity = convertToEntityForSaving(entityToAdd);
ofy().save().entity(entity).now();
log.info("Entity created: " + JsonUtils.toJson(entityToAdd));
return makeAttributes(entity);
}

 E convertToEntityForSaving(A entityAttributes)throws EntityAlreadyExistsException {
return entityAttributes.toEntity();
}

abstract  boolean hasExistingEntities(A entityToCreate) ;

public  A putEntity(A entityToAdd)throws InvalidParametersException {
try {
return createEntity(entityToAdd, false);
}
catch(EntityAlreadyExistsException e){
assert false : "Unreachable branch";
return null;
}
}

public  List<A> putEntities(Collection<A> entitiesToAdd)throws InvalidParametersException {
assert entitiesToAdd != null;
List<E> entities = new  ArrayList<>();
for (A entityToAdd : entitiesToAdd)
{
entityToAdd.sanitizeForSaving();
if (!entityToAdd.isValid())
{
throw new  InvalidParametersException(entityToAdd.getInvalidityInfo());
}
E entity = entityToAdd.toEntity();
entities.add(entity);
}
for (A attributes : entitiesToAdd)
{
log.info("Entity created: " + JsonUtils.toJson(attributes));
}
ofy().save().entities(entities).now();
return makeAttributes(entities);
}

<T>  boolean hasSameValue(T oldValue, T newValue) {
return Objects.equal(oldValue, newValue);
}

 void saveEntity(E entityToSave) {
assert entityToSave != null;
log.info("Entity saved: " + JsonUtils.toJson(entityToSave));
ofy().save().entity(entityToSave).now();
}

 void saveEntities(Collection<E> entitiesToSave) {
for (E entityToSave : entitiesToSave)
{
log.info("Entity saved: " + JsonUtils.toJson(entityToSave));
}
ofy().save().entities(entitiesToSave).now();
}

 void deleteEntity(Key<E> key) {
assert key != null;
deleteEntity(Collections.singletonList(key));
}

 void deleteEntity(List<Key<E>> keys) {
assert keys != null;
assert !keys.contains(null);
for (Key<E> key : keys)
{
log.info(String.format("Delete entity %s of key (id: %d, name: %s)", key.getKind(), key.getRaw().getId(), key.getName()));
}
ofy().delete().keys(keys).now();
}

abstract  LoadType<E> load() ;

abstract  A makeAttributes(E entity) ;

 List<A> makeAttributes(Collection<E> entities) {
List<A> attributes = new  LinkedList<>();
for (E entity : entities)
{
attributes.add(makeAttributes(entity));
}
return attributes;
}

 A makeAttributesOrNull(E entity) {
if (entity != null)
{
return makeAttributes(entity);
}
return null;
}

 Optional<Key<E>> makeKeyFromWebSafeString(String webSafeString) {
if (webSafeString == null)
{
return Optional.empty();
}
try {
return Optional.of(Key.create(webSafeString));
}
catch(IllegalArgumentException e){
return Optional.empty();
}
}

}
