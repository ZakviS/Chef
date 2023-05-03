package controller;

import model.Ingredient;

import java.util.ArrayList;

public abstract class saladController {

    public saladController(){}


    public void printInfo(ArrayList<Ingredient> salad){
        System.out.println("Ingredient of salad");
        for (int i = 0; i < salad.size();i++){
            System.out.println(salad.get(i).toString());
            //System.out.println(salad.get(i).countIngredient());
        }
    }

    public void maxWeight(ArrayList<Ingredient> salad){
        int max = 0;
        int index = 0;
        for (int i = 0; i < salad.size(); i++){
            if (salad.get(i).getWeight() >= max ) {
                max = salad.get(i).getWeight();
                index = i;
            }
        }

        System.out.printf("Max weight %d, that's a %s \n\n",max, salad.get(index).getName());
    }

    public void maxCalories(ArrayList<Ingredient> salad){
        double max = 0;
        int index = 0;
        for (int i = 0; i < salad.size(); i++){
            if (salad.get(i).getCalories() >= max ) {
                max = salad.get(i).getCalories();
                index = i;
            }
        }
        System.out.printf("Maximum number of calories %.1f, that's a %s \n\n",max, salad.get(index).getName());

    }

}
