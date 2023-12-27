package org.example;

import java.util.ArrayList;

// CoffeeBuilder interface
interface CoffeeBuilder {
    void buildType(String type);
    void buildSize(String size);
    void buildToppings(ArrayList<String> toppings);
}

// Coffee class
class Coffee {
    private String size;
    public String type;
    private ArrayList<String> toppings;

    public Coffee(String size, String type, ArrayList<String> toppings) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

// Espresso class implementing CoffeeBuilder
class Espresso implements CoffeeBuilder {
    private Coffee coffee = new Coffee("espresso", "", null);

    @Override
    public void buildType(String type) {
        coffee = new Coffee(type, "", null);
    }

    @Override
    public void buildSize(String size) {
        coffee = new Coffee(coffee.type, size, null);
    }

    @Override
    public void buildToppings(ArrayList<String> toppings) {
        // Handle toppings as needed
    }

    public Coffee getResult() {
        return coffee;
    }
}
