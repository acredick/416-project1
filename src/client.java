import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;

//todo comment
public class client {
     /* MEMBERS */
     public cache cache = new cache();
     private long length = 0;
     private String serverIP = null;
     private String serverPort = null;
     private String cacheIP = null;
     private String cachePort = null;
     private String transportProtocol = null;
     private Socket serverSocket = null;
     private Socket cacheSocket = null;
     private DataInputStream input = null;
     private DataOutputStream output = null;


     /* METHODS */
     public static void main(String[] args) {
          String serverIP = args[0];
          String serverPort = args[1];
          String cacheIP = args[2];
          String cachePort = args[3];
          String transportProtocol = args[4];
     }

     public void put(File fileName) {


     }

     public void get(File fileName) {
          // connect to cache


     }

     public void quit() {

     }

     // used for client to server/cache
     private void establishConnections() {
          try {
               serverSocket = new Socket(serverIP, Integer.parseInt(serverPort));
               cacheSocket = new Socket(cacheIP, Integer.parseInt(cachePort));
          }
          catch (Exception e) {
          }
     }
}
