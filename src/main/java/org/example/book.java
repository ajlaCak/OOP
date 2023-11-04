package org.example;

public class book implements tobestored{
    private String book;
    private String name;
    private double weight;

    public book(String book,String name, double weight) {
        this.book = book;
        this.name=name;
        this.weight=weight;
    }
    public String toString(){
        return book+" "+name;
    }
    public double weight(){
        return weight;
    }
}
