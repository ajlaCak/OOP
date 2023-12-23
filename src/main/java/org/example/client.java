package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client {
    private Socket socket;
    private String username;
    private BufferedWriter bw;
    private BufferedReader br;
    public client(Socket socket,String username) throws IOException {
        try{
        this.socket=socket;
        this.bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        this.br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.username=username;
    }catch (IOException e){closeeverything(socket,br,bw);}}

        public void sendmsg() throws IOException {
try{
    bw.write(username);
    bw.newLine();
    bw.flush();
    Scanner scanner=new Scanner(System.in);
    while(socket.isConnected()){
        String msg=scanner.nextLine();
        bw.write(msg);
        bw.newLine();
        bw.flush();
    }
} catch (IOException e) {
    closeeverything(socket,br,bw);
}
        }
        public void listen(){
        new Thread(new Runnable() {
            @Override
            public void run() {String msg;
                while(socket.isConnected()){
                    try{
msg=br.readLine();
System.out.println(msg);

                    }catch (IOException e) {
                        try {
                            closeeverything(socket,br,bw);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        }).start();
        }
        public void closeeverything(Socket socket, BufferedReader br, BufferedWriter bw) throws IOException {
           try{
            if(br!=null){
                br.close();
            }
            if(bw!=null){bw.close();}
            if(socket!=null){socket.close();}}
        catch (IOException e){e.printStackTrace();}
        }
public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter username");
        String username=scanner.nextLine();
        Socket socket =new Socket("localhost",1234);
        client c=new client(socket,username);
        c.listen();
        c.sendmsg();
}
}


