package org.example;

public class indexof {
    public static void main(String[] args){
        int []a={1,7,8,0,3};
        System.out.println(index(a));

    }
    public static int index(int[] a){
        int min=a[0];
        for(int i:a){
            if(i<min){min=i;}

        }
        int ind=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==min){ind=i;}
        }return ind;
    }
}
