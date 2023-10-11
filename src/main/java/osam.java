public class osam {
    public static void main(String[] args){
        inv(8);
    }
    public static void piramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
    public static void inv(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }}
