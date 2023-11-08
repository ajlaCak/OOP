package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        nightsky nightSky = new nightsky(0.9, 30, 10);
        nightSky.print();
        System.out.println("Stars printed in the last line: " + nightSky.get());
    }
    public int find(int []a){
        int le=-1;
        for(int i:a){
            if(i%2==0){le=i;}
        }
        if(le!=-1){return le;}
        else return 0;
    }
}