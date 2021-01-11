package com.kodilla.good.patterns.challenges.food2door;

public class Supplier implements FoodOrderingProc {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean process(Supplier supp, FoodProduct foodName){
        System.out.println("zamowienie dla sklepu: " + name + " udalo sie zrealizowac ");
        return true;
    }
}