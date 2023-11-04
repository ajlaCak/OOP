package org.example;

public class militaryservice implements  nationalservice{
    private int daysleft;

    public militaryservice(int daysleft) {
        this.daysleft = daysleft;
    }

    public int getdaysleft(){return daysleft;}

    public void work(){this.daysleft=daysleft-1;}
}
