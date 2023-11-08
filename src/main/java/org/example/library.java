package org.example;

import java.util.ArrayList;

public class library {
    private ArrayList<book> l;
    public library(){
        this.l=new ArrayList<>();
    }
    public void add(book b){
        l.add(b);
    }
    public void print(){
        for(book i:l){
            System.out.println(i);
        }
    }
    public ArrayList<book> searchByTitle(String title){
        ArrayList<book> found=new ArrayList<>();
        for(book i:l){
            if(stringutils.included(i.Title(),title)){found.add(i);}
        } return found;
    }
    public ArrayList<book> searchByYear(int year){
        ArrayList<book> found=new ArrayList<>();
        for(book i:l){
            if(i.Year()==year){found.add(i);}
        } return found;
    }
    public ArrayList<book> searchByPublisher(String publisher){
        ArrayList<book> found=new ArrayList<>();
        for(book i:l){
            if(stringutils.included(i.Publisher(),publisher)){found.add(i);}
        } return found;
    }
}
