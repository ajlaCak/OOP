package org.example;

public class civilservice implements nationalservice{
    private int daysleft;
    public civilservice(){
        this.daysleft=364;
    }
    @Override
    public int getdaysleft(){return daysleft;}
    public void work(){this.daysleft=daysleft-1;}
}
