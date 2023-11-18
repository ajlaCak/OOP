package org.example;

import java.util.ArrayList;

public class mng {
    private ArrayList<empl> l;
    public mng(ArrayList<empl> ll){this.l=ll;}
    public ArrayList<empl> imal(ArrayList<empl> l, double salary){
        ArrayList<empl> nova=new ArrayList<>();
        for(empl i:l){
            if(i.salary()>salary){nova.add(i);}
        }return nova;
    }
    public double totalsalary(ArrayList<empl> l){
        double s=0;
        for(empl i:l){
            s=s+i.salary();
        }return s;
    }
    public void displayinfo(ArrayList<empl> l){
        for(empl i:l){
            System.out.println(i.toString());
        }
    }
}
