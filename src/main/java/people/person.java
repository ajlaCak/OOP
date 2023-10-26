package people;

public class person {
    private String name;
    private String address;
    private int age;
    private String country;

    public person(String name, String address,int age,String country) {
        this.name = name;
        this.address = address;
        this.age=age;
        this.country=country;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
