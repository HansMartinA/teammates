package teammates.logic.core;

public interface FileStorageService {
 boolean doesFileExist(String fileKey) ;

 byte[]  getContent(String fileKey) ;

 void delete(String fileKey) ;

 void create(String fileKey, byte[]  contentBytes, String contentType) ;

}
