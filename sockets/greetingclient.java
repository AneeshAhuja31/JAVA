import java.net.*;
import java.io.*;
public class greetingclient {
    public static void main(String[] args) {
        String serverName = args[0]; //localhost
        int port = Integer.parseInt(args[1]); //6066
        try{
            System.out.println("Connecting to: "+serverName+" on port "+ port);
            Socket client = new Socket(serverName,port);
            
            System.out.println("Just connected to "+client.getRemoteSocketAddress()); // R
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from "+ client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says "+in.readUTF());
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
