package org.example;
import java.util.Random;

public class nightsky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint=0;

    public nightsky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;

    }
    void printline(){
        Random r=new Random();
        for(int i=0;i<this.width;i++){
            if(r.nextDouble()<this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else{System.out.print(" ");}
        }System.out.println();
    }
    void print(){
        this.starsInLastPrint=0;
        for(int i=0;i<this.height;i++){
            printline();
        }
    }
    public int get(){return this.starsInLastPrint;}
}
