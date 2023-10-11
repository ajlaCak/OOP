public class devet{
    public static void main(String[] args){
        piramidsecond(8);
    }
    public static void piramid(int n){
        int k=1;
        for(int i=0;i<n;i++){
            k=1;
            for(int j=0;j<i;j++){
                System.out.print(k++);
            }System.out.println(" ");
        }}
    public static void piramidsecond(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                System.out.print(i);
            }System.out.println(" ");
        }}

    }
