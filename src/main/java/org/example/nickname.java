package org.example;
import java.util.HashMap;

public class nickname {
    public static void main(String[] args){
        HashMap<String,String> nicknames=new HashMap<>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");
        String n=nicknames.get("mikael");
        System.out.println(n);
    }
}
