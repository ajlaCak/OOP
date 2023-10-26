package org.example;

import org.example.tip;

public class shape {
    private String color;
    private tip a;

    public shape(String color,  tip a) {
        this.color = color;
        this.a=a;
    }
    public void getinfo(){
        System.out.println(color);
        if(a==a.FILLED){System.out.println("FILLED");}
        else {System.out.println("not filled");}
    }
    public double getarea(){
        return 0;
    }


}
