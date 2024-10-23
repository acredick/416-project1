import java.io.File;
import java.net.Socket;
import java.util.ArrayList;

//todo comment
public class cache {
     /* MEMBERS */
     ArrayList<File> localFileCache = new ArrayList<>();
     private long length = 0;
     private String portNum = null;
     private String serverIP = null;
     private String serverPort = null;
     private String transportProtocol = null;

     /* METHODS */
     public static void main(String[] args) {
          String portNum = args[0];
          String serverIP = args[1];
          String serverPort = args[2];
          String transportProtocol = args[3];
     }

     public File checkCache(File fileName) {
          // check if file is in cache already
          for (int i = 0; i < localFileCache.size(); i++) {
               if (localFileCache.get(i).getAbsoluteFile() == fileName)
                    return localFileCache.get(i);
          }

          // get file from server
          return null;
          // add file to local cache, return file
     }
}
