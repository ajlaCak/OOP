package org.example;

import java.util.ArrayList;
import java.util.List;

public class generic2 {
    public static<T> List <T> reverse(List<T> n){
List <T> reversed=new ArrayList<>();
for(int i=n.size()-1;i<=0;i--){
    reversed.add(n.get(i));
}return reversed;
    }
}
