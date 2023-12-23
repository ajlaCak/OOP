package org.example;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    private ServerSocket serversocket;
    public server(ServerSocket serversocket) {
        this.serversocket = serversocket;
    }
public void startserver(){
        try{
            while(!serversocket.isClosed()){
                Socket socket=serversocket.accept();
                System.out.println("new client is connected");
                Clienthandler clienthandler=new Clienthandler(socket);
                Thread thread=new Thread(clienthandler);
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
public void close(){
    try{
        if(serversocket!=null){
            serversocket.close();
        }
    }catch(IOException e){e.printStackTrace();}


}
public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(1234);
        server ser=new server(s);
        ser.startserver();
}
}
