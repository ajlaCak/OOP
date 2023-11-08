package org.example;

public class elegant {
    public static void main(String[] args){
        int []a={1,2,3,4,5};
        printelegantly(a);
    }
    public static void printelegantly(int[] a){
        for(int i=0;i<a.length;i++){

            if(i==a.length-1){System.out.print(a[i]+".");}
            else{System.out.print(a[i]+",");}
        }
    }
}
