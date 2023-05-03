package controller;

import model.Cucumber;
import model.Ingredient;
import model.Onion;
import model.Tomato;

import java.util.ArrayList;

import static controller.stat.*;

public class MeatSaladController extends saladController{
    ValidInsert vi = new ValidInsert();
    ArrayList<Ingredient> salad = new ArrayList<Ingredient>();

    public ArrayList<Ingredient> getSalad() {
        return salad;
    }

    public void addOnion(int weight){
        AddOnion(weight, vi, salad);

    }

//    static void AddOnion(int weight, ValidInsert vi, ArrayList<Ingredient> salad) {
//        if (vi.searchName(salad,"Onion")){
//            salad.get(vi.searchId(salad,"Onion")).setWeight(salad.get(vi.searchId(salad,"Onion")).getWeight() + weight);
//            double call = weight *0.4;
//            salad.get(vi.searchId(salad,"Onion")).setCalories(salad.get(vi.searchId(salad,"Onion")).getCalories() + call);
//        }else {
//            Onion onion = new Onion("Onion", weight, 0.4);
//            salad.add(onion);
//        }
//    }

    public void addCucumber(int weight){

        AddCucumber(weight, vi, salad);

    }


    public void addTomato(int weight){

        AddTomato(weight, vi, salad);
    }

    public void addChicken(int weight){

        AddChicken(weight, vi, salad);
    }

    public void addTurkey(int weight){

        AddTurkey(weight, vi, salad);
    }

}
