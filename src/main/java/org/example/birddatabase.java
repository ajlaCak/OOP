package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class birddatabase {
    private HashMap<String,bird> database;
    private Scanner scanner;

    public birddatabase() {
        database = new HashMap<>();
        scanner =new Scanner(System.in);
    }
    public void run(){
        while(true){
            System.out.println("?");
            String command=scanner.next();
            if(command.equals("add")){add();}
            else if(command.equals("observation")){addobservation();}
            else if(command.equals("show")){print();}
            else if(command.equals("quit")){break;}
            else {System.out.println("invalid input");}
        }
    }
    public void add(){
        System.out.println("enter name");
        String name= scanner.next();
        database.put(name,new bird(name));
    }
    public void addobservation(){
        System.out.println("daj ime");
        String name= scanner.next();
        bird b=database.get(name);
        if(name!=null){
            b.addobservation();
        }
        else{System.out.println("bird not found");
    }}
        public void print(){
        for(bird b:database.values()){
            System.out.println(b);
        }
        }
    }

}
