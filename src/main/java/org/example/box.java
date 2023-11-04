package org.example;

import java.util.ArrayList;

public class box {
    private ArrayList<tobestored> elementi;
    private int max;

    public box(int max) {
        this.max = max;
        this.elementi=new ArrayList<>();
    }
    public double totalweight(){
        double total=0;
        for(tobestored i :elementi){
            total=+i.weight();
        }
        return total;
    }
    public void add(tobestored item){
        if(this.totalweight()+item.weight()<=max){
            elementi.add(item);
        }
    }

    @Override
    public String toString() {
        return "box{" +
                "elementi=" + elementi +
                ", max=" + max +
                '}';
    }
}
