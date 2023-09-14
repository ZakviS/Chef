package controller;


import model.Ingredient;


import java.util.ArrayList;
import java.util.List;

import static controller.stat.*;

public class VgSaladController extends saladController{
    ValidInsert vi = new ValidInsert();
    List<Ingredient> salad = new ArrayList<Ingredient>();

    public List<Ingredient> getSalad() {
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
