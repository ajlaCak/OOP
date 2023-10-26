package org.example;

public class circle extends shape {
    private double radius;
    public circle(String color, tip a,double radius) {
        super(color, a);
        this.radius=radius;
    }
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println(radius);
    }
    @Override
    public double getarea(){
        return 3.14*radius*radius;
    }
    public double calculateCircumference(double PI, double r){
        return 2*PI*r;
    }
    public double calculateCircumference(double r){
        double pi=3.14;
        return 2*pi*r;
    }
}
