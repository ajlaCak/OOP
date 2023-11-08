package org.example;

public class bird {
    private String name;

    private int observ;

    public bird(String name) {
        this.name = name;

        this.observ = 0;
    }
    public void addobservation(){observ++;}

    @Override
    public String toString() {
        return "bird{" +
                "name='" + name + '\'' +

                ", observ=" + observ +
                '}';
    }
}
