package org.example;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Clienthandler implements Runnable{
    public static ArrayList<Clienthandler> clienthandlers=new ArrayList<>();
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
    private String username;
    public Clienthandler(Socket socket) throws IOException {
        try{
        this.socket=socket;
        this.bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.username=br.readLine();
        clienthandlers.add(this);
        broadcastmsg(username+"has entered the chat");
        } catch (IOException e) {
            closeeverything(socket,br,bw);
        }
    }
    @Override
    public void run(){
        String msg;
        while(socket.isConnected()){
            try{
                msg=br.readLine();
                broadcastmsg(msg);
            }catch (IOException e){
                try {
                    closeeverything(socket,br,bw);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
        }
    }
    public void broadcastmsg(String m) throws IOException {
        for(Clienthandler i:clienthandlers){
            try{
                if(!i.username.equals(username)){
                    i.bw.write(m);
                    i.bw.newLine();
                    i.bw.flush();
                }
            }catch(IOException e){
                closeeverything(socket,br,bw);
            }
        }
    }
    public void removehandler() throws IOException {
        clienthandlers.remove(this);
        broadcastmsg(username+"left the chat");
    }
    public void closeeverything(Socket socket,BufferedReader br,BufferedWriter bw) throws IOException {
        removehandler();
        try{
            if(br!=null){
                br.close();
            }
            if(bw!=null){bw.close();}
            if(socket!=null){socket.close();}
        }catch (IOException e){e.printStackTrace();}
    }
}
