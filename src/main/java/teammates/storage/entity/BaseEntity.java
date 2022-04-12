package teammates.storage.entity;

import java.time.Instant;
import com.google.cloud.Timestamp;
import com.google.cloud.datastore.TimestampValue;
import com.google.cloud.datastore.Value;
import com.google.cloud.datastore.ValueType;
import com.googlecode.objectify.impl.Path;
import com.googlecode.objectify.impl.translate.CreateContext;
import com.googlecode.objectify.impl.translate.LoadContext;
import com.googlecode.objectify.impl.translate.SaveContext;
import com.googlecode.objectify.impl.translate.TypeKey;
import com.googlecode.objectify.impl.translate.ValueTranslator;
import com.googlecode.objectify.impl.translate.ValueTranslatorFactory;
public class BaseEntity {
 BaseEntity(){
}
public static class InstantTranslatorFactory extends ValueTranslatorFactory<Instant, Timestamp> {
public  InstantTranslatorFactory(){
super(Instant.class);
}
@Override
protected  ValueTranslator<Instant, Timestamp> createValueTranslator(TypeKey<Instant> tk, CreateContext ctx, Path path) {
return new  ValueTranslator<>(ValueType.TIMESTAMP){
@Override
protected  Instant loadValue(Value<Timestamp> value, LoadContext ctx, Path path) {
return value == null ? null : value.get().toDate().toInstant();
}

@Override
protected  Value<Timestamp> saveValue(Instant value, SaveContext ctx, Path path) {
return value == null ? null : TimestampValue.of(Timestamp.of(java.util.Date.from(value)));
}

}
;
}

}
}
