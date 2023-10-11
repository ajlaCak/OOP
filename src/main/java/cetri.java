import java.util.Scanner;
public class cetri {
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("enter first");
        int f=reader.nextInt();
        System.out.println("enter last");
        int l=reader.nextInt();
        int s=0;
        for(int i=f;i<=l;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}
