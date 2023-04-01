package controller;

import model.Ingredient;

import java.util.ArrayList;

public class ValidInsert {

    ArrayList<Ingredient> salad;

    public boolean ValidWeight(int weight){
        if (weight <= 0) return true;
        return false;
    }

    public void isExist(){

    }

    public <T> boolean searchName(ArrayList<Ingredient> list, String ing){
        salad = list;

        boolean ans = false;
        for (int i = 0; i < salad.size();i++){
            if (salad.get(i).getName().equals(ing)) {
                ans = true;
            }
        }
        return ans;
    }

    public <T> int searchId (ArrayList<Ingredient> list, String ing){
        salad = list;
        int  id = 0;
        for (int i = 0; i < salad.size();i++){
            if (salad.get(i).getName().equals(ing)) {
                id = i;
            }
        }
        return id;
    }

}
