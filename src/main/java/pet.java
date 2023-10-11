import java.util.Scanner;
public class pet {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("unesi br");
        int n=reader.nextInt();
        int r=0;
        r=(int)Math.pow(2,n);
        System.out.println(r);
    }
}
