import java.util.Random;
import java.util.Scanner;
public class deset {
    public static void main(String[] args){
        int c=1;
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
int k=drawnumber();
while(n!=k){


 if (n<k){System.out.println("it is bigger "+c);
     n=reader.nextInt();
 c++;}
else{System.out.println("it is smaller "+c);
     n=reader.nextInt();
c++;}
    }
        System.out.println("right guess  " +c);
    }

    public static int drawnumber(){
        Random rand=new Random();
        int n=rand.nextInt(100+1)+0;
        return n;

    }
}
