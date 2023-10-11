import java.util.Scanner;
public class treci {
    public static void main (String[] args){
Scanner reader=new Scanner(System.in);
int sum=0;
while(true){
    int read=reader.nextInt();
    if(read==0){break;}
    else{
        sum=sum+read;
    }System.out.println("sum now "+sum);
}System.out.println(sum);
    }
}
