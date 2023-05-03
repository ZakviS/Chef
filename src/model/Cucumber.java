package model;

public class Cucumber extends Ingredient {

    {
        System.out.println("not static block initialize");
    }

    public Cucumber(String name, int weight, double k) {
        super(name, weight, 0.16);
        System.out.println("constructor");
    }

}
