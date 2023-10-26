package org.example;

public class rectangle extends shape {
    private double h;
    private double w;
    public rectangle(String color, tip a,double h, double w) {
        super(color, a);
        this.h=h;
        this.w=w;
    }
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println(h);
        System.out.println(w);

    }
    @Override
    public double getarea(){
        return w*h;
    }
}

