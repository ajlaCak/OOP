package org.example;

public class smalest {
    public static void main(String[] args){
        int[]a={1,5,4,3,0,7};
        System.out.println(smallest(a));
    }
    public static int smallest(int[] a){
        int min=a[0];
        for(int i:a){
            if(i<min){min=i;}
        }return min;
    }
}
