package org.example;

public class swap {
    public static void main(String[] args){
        int []a={1,2,3,4,5,6,7,8,9,10};
        int f=0;
        int l=4;
        swap(a,f,l);
        for(int i:a){
            System.out.println(i);
        }
        System.out.println(tostr(a));

    }
    public static void swap(int a[],int f,int l){
        int temp=0;
        temp=a[f];
        a[f]=a[l];
        a[l]=temp;
    }
    public static String tostr(int[]a){
        String s="";
        for(int i:a){
            s=s+i;
        }return s;
    }
}
