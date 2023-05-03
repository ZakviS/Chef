package controller;

import model.Cucumber;
import model.Ingredient;
import model.Onion;
import model.Tomato;

import java.util.ArrayList;

public class saladController {
    public ArrayList<Ingredient> getSalad() {
        return salad;
    }

    ValidInsert vi = new ValidInsert();
    ArrayList<Ingredient> salad = new ArrayList<Ingredient>();
    public saladController(){}

    public saladController(saladController saladcon){
        salad = saladcon.salad;
    }

    public void addOnion(int weight){

        if (vi.searchName(salad,"Onion")){
            vi.searchId(salad,"Onion");
            salad.get(vi.searchId(salad,"Onion")).setWeight(salad.get(vi.searchId(salad,"Onion")).getWeight() + weight);
            double call = weight *0.4;
            salad.get(vi.searchId(salad,"Onion")).setCalories(salad.get(vi.searchId(salad,"Onion")).getCalories() + call);
        }else {
            Onion onion = new Onion("Onion", weight, 0.4);
            salad.add(onion);
        }

    }

    public void addCucumber(int weight){

        if (vi.searchName(salad,"Cucumber")){
            vi.searchId(salad,"Cucumber");
            salad.get(vi.searchId(salad,"Cucumber")).setWeight(salad.get(vi.searchId(salad,"Cucumber")).getWeight() + weight);
            double call = weight * 0.16;
            salad.get(vi.searchId(salad,"Cucumber")).setCalories(salad.get(vi.searchId(salad,"Cucumber")).getCalories() + call);
        }else {
            Cucumber cucumber = new Cucumber("Cucumber", weight, 0.4);
            salad.add(cucumber);
        }


    }

    public void addTomato(int weight){

        if (vi.searchName(salad,"Tomato")){
            vi.searchId(salad,"Tomato");
            salad.get(vi.searchId(salad,"Tomato")).setWeight(salad.get(vi.searchId(salad,"Tomato")).getWeight() + weight);
            double call = weight * 0.16;
            salad.get(vi.searchId(salad,"Tomato")).setCalories(salad.get(vi.searchId(salad,"Tomato")).getCalories() + call);
        }else {
            Tomato tomato = new Tomato("Tomato", weight, 0.2);
            salad.add(tomato);
        }


    }

    public void printInfo(){
        System.out.println("Ingredient of salad");
        for (int i = 0; i < salad.size();i++){
            System.out.println(salad.get(i).toString());
            System.out.println(salad.get(i).countIngredient());
        }
        salad.get(1).countIngredient();
    }

    public void maxWeight(){
        int max = 0;
        int index = 0;
        for (int i = 0; i < salad.size();i++){
            if (salad.get(i).getWeight() >= max ) {
                max = salad.get(i).getWeight();
                index = i;
            }
        }

        System.out.printf("Max weight %d, that's a %s \n\n",max, salad.get(index).getName());
    }

    public void maxCalories(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < salad.size();i++){
            if (salad.get(i).getCalories() >= max ) {
                max = salad.get(i).getCalories();
                index = i;
            }
        }
        System.out.printf("Maximum number of calories %.1f, that's a %s \n\n",max, salad.get(index).getName());

    }

}
