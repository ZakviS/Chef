package model;

public abstract class Ingredient {

    public String name;
    public double Calories;
    public int weight;

    public Ingredient(String name, int weight,double k) {
        this.name = name;
        this.weight = weight;
        Calories = weight * k;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(double calories) {
        Calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public String printInfoStr(){
        String result = String.format("Name: %s, calories: %.1f, weight: %d \n",name, Calories, weight);
        return result;
    }
}
