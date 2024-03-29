package controller;

import model.Ingredient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class saladController {

    public saladController(){}


    public void printInfo(List<Ingredient> salad){
        System.out.println("Ingredient of salad");

        for (Ingredient s : salad){
            System.out.println(s);

        }

    }

    public void maxWeight(List<Ingredient> salad){
        Comparator<Ingredient> weightComparator = new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient ingredient1, Ingredient ingredient2) {
                // Сравниваем по полю weight
                return Double.compare(ingredient1.getWeight(), ingredient2.getWeight());
            }
        };

        // Находим максимальный элемент в списке salad с использованием компаратора
        Ingredient maxWeightIngredient = Collections.max(salad, weightComparator);

        // Выводим информацию о максимальном весе
        System.out.printf("Maximum weight: %d that's a %s\n\n", maxWeightIngredient.getWeight(), maxWeightIngredient.getName());
    }


    public void maxCalories(List<Ingredient> salad){


        Comparator<Ingredient> caloriesComparator = new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient ingredient1, Ingredient ingredient2) {
                // Сравниваем по полю calories
                return Double.compare(ingredient1.getCalories(), ingredient2.getCalories());
            }
        };

        // Находим максимальный элемент в списке salad с использованием компаратора
        Ingredient maxCaloriesIngredient = Collections.max(salad, caloriesComparator);

        // Выводим информацию о максимальных калориях
        System.out.printf("Maximum number of calories: %.1f, that's a %s\n\n", maxCaloriesIngredient.getCalories(), maxCaloriesIngredient.getName());
    }

    public void sortByName(List<Ingredient> salad){
        salad.sort(Comparator.comparing(Ingredient::getName));
        System.out.println(salad);
    }
    public void sortByWeight(List<Ingredient> salad){
        salad.sort(Comparator.comparing(Ingredient::getWeight));
        System.out.println(salad);
    }
    public void sortByCalories(List<Ingredient> salad){
        salad.sort(Comparator.comparing(Ingredient::getCalories));
        System.out.println(salad);

    }

    public double mc(List<Ingredient> salad){
        double max = 0;
        int index = 0;
        for (int i = 0; i < salad.size(); i++){
            if (salad.get(i).getCalories() >= max ) {
                max = salad.get(i).getCalories();
                index = i;
            }
        }
        return max;
    }


    public int mw(List<Ingredient> salad){
        int max = 0;
        int index = 0;
        for (int i = 0; i < salad.size(); i++){
            if (salad.get(i).getWeight() >= max ) {
                max = salad.get(i).getWeight();
                index = i;
            }
        }

        return max;
    }
}
