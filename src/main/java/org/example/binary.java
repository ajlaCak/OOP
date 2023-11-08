package org.example;

public class binary {
    public static void main(String[] args){
        int[] a={0,2,4,6,5,6,7};
        int t=4;
        int result=binary(a,t);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
    public static int binary(int[] a, int t){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==t){return mid;}
            if(a[mid]<t){l=mid+1;}
            else{r=mid-1;}
        }return -1;
    }
}
