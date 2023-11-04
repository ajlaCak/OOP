package org.example;

import java.util.Objects;

public class thing implements tobestored{
    private String name;
    private double weight;

    public thing(String name, double weight) {
        if(weight<0){throw new IllegalArgumentException("weight cant be negative");}
        this.name = name;

        this.weight = weight;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        thing thing = (thing) o;
        return Objects.equals(name, thing.name);
    }
    @Override
    public double weight(){return weight;}@Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
