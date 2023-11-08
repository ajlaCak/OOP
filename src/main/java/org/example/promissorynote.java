package org.example;

import java.util.HashMap;

public class promissorynote {
    private HashMap<String,Double> l;

    public promissorynote(HashMap<String, Double> l) {
        this.l = l;
    }
    public void setloan(String ko, double kolko){
        if(l.containsKey(ko)){
            double loan=l.get(ko);
            l.put(ko,kolko+loan);
        }
        else{
            l.put(ko,kolko);
        }
    }
    public double howmuch(String ko){
        return l.get(ko);
    }
}
