package org.example;
import java.util.Scanner;

public class interfaceuser {
    private Scanner scanner;
    private dictionary di;

    public interfaceuser(Scanner scanner, dictionary di) {
        this.scanner = scanner;
        this.di = di;
    }
    public void start() {
        while (true) {
            System.out.print("Enter a command (translate, add, quit): ");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("translate")) {
                translateword();
            } else if (command.equals("add")) {
                addword();
            } else {
                System.out.println("Invalid command. Available commands: translate, add, quit");
            }
        }
    }
    public void translateword(){
        System.out.println("enter what to trNSLte");
        String w= scanner.nextLine();
        String t=di.translate(w);
        if(t!=null){System.out.println(t);}
        else{System.out.println("da");}

    }
    public  void addword(){
        String f=scanner.nextLine();
        String w=scanner.nextLine();
        dictionary.add(f,w);
    }
}
