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

    public void setCalories(int calories) {
        Calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo(){
        //System.out.println("Name: " + name + ", calories: " + Math.round(Calories) + " " + Calories + ", weight: " + weight + "g.");
        System.out.printf("Name: %s, calories: %.1f, weight: %d",name, Calories, weight);
    }

    public String printInfoStr(){
        String result = String.format("Name: %s, calories: %.1f, weight: %d",name, Calories, weight);
        return result;
    }
}
