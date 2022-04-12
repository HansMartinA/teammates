package teammates.storage.search;

import java.util.Map;
import teammates.common.datatransfer.attributes.EntityAttributes;
abstract class SearchDocument<T extends EntityAttributes<?>>  {
final T attribute;

 SearchDocument(T attribute){
this.attribute = attribute;
}
abstract  Map<String, Object> getSearchableFields() ;

}
