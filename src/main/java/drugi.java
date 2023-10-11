import java.util.Scanner;
public class drugi {
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;
        for(int i=0;i<3;i++){
            System.out.println("enter number");
            read=reader.nextInt();
            sum=sum+read;
        }
        System.out.println(sum);
    }
}
