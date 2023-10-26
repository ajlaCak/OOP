package people;

import java.util.ArrayList;
import java.util.List;

public class student extends person {
     private int credits;
     private int id;
     private List<Integer> grades;
     public student(String name,String address,int age,String country,int credits,int id){
         super(name,address,age,country);
         this.credits=credits;
         this.id=id;
         this.grades=new ArrayList<Integer>();
     }
     public void addg(int a){
         if(a<0 || a>100){System.out.println("false");}
         else {grades.add(a);}
     }
     public int getCredits(){
         return credits;
     }
     public void study(){
         credits++;
     }
     @Override
     public String toString() {
         return super.toString() + " " + credits;
     }
}
