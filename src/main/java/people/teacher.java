package people;

public class teacher extends person{
    private int salary;
    public teacher(String name, String address,int age, String country,int salary){
        super(name,address,age,country);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return super.toString()+ " "+salary;
    }
}
