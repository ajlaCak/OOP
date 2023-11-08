package org.example;
import java.util.List;

public class generic1 {
    public static <T extends Number> int sumodeven(List<T> n){
        int e=0;
        int o=0;
        for(T i:n){
            int v=i.intValue();
            if(v%2==0){e=e+v;}
            else{o=o+v;}
        }return e+o;
    }
}
