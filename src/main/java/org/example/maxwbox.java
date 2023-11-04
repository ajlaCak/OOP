package org.example;

import java.util.ArrayList;

public class maxwbox extends box{
    private int max;
    private ArrayList<tobestored> el;
    public maxwbox(int max){
        super(max);
        this.el=new ArrayList<>();

    }
    @Override
    public void add(tobestored thing) {
        if (thing.weight() + totalWeight() <= max) {
            el.add(thing);
        }
    }

    private double totalWeight() {
        double total = 0;
        for (tobestored thing : el) {
            total += thing.weight();
        }
        return total;
    }
}
