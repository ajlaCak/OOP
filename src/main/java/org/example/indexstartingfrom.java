package org.example;

public class indexstartingfrom {
    public static void main(String[] args){
        int in=2;
        int []a={0,7,85,10,3};
        System.out.println(index(a,in));

    }
    public static int index(int[] a,int in){
        int min=a[in];
        for(int i=in;i<a.length;i++){
            if(i<min){min=a[i];}

        }
        int ind=0;
        for(int i=in;i<a.length;i++){
            if(a[i]==min){ind=i;}
        }return ind;
    }
}
