import java.io.DataInputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//todo comment
public class server {
     /* MEMBERS */
     private long length = 0;

     private ArrayList<File> localFileCache = new ArrayList<>();
     private String portNum = null;
     private String transportProtocol = null;

     /* METHODS */
     public void main(String[] args) {
          portNum = args[0];
          transportProtocol = args[1];
     }
}
