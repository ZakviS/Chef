package controller;

import model.Cucumber;
import model.Ingredient;
import model.Onion;
import model.Tomato;

import java.util.ArrayList;

import static controller.stat.*;

public class VgSaladController extends saladController{
    ValidInsert vi = new ValidInsert();
    ArrayList<Ingredient> salad = new ArrayList<Ingredient>();

    public ArrayList<Ingredient> getSalad() {
        return salad;
    }

    public void addOnion(int weight){

        AddOnion(weight, vi, salad);

    }

    public void addCucumber(int weight){

        AddCucumber(weight, vi, salad);


    }

    public void addTomato(int weight){

        AddTomato(weight, vi, salad);

    }


}
