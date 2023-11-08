package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class dictionary {
    private HashMap<String,String> translation;
    public dictionary(){
        translation=new HashMap<>();

    }
    public String translate(String word){
        return translation.get(word);
    }
    public static void add(String n, String t){
        translation.put(n,t);
    }
    public int getamount(){
        return translation.size();
    }
    public ArrayList<String> lista(){
        ArrayList<String > l=new ArrayList<>();
        for(Map.Entry<String,String> entry:translation.entrySet()){
            String w=entry.getKey()+" "+entry.getValue();
            l.add(w);
        }
        return l;
    }
}
