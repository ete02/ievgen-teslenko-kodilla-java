package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMacBuilder {

    private RollType roll;
    private int burgers;
    private SauceType sauce;
    private final List<IngredientsType> ingredients = new ArrayList<>();

    public BigMacBuilder roll(RollType roll) {
        this.roll = roll;
        return this;
    }

    public BigMacBuilder burgers(int burgersCount) {
        this.burgers = burgersCount;
        return this;
    }

    public BigMacBuilder sauce(SauceType sauce) {
        this.sauce = sauce;
        return this;
    }

    public BigMacBuilder ingredients(IngredientsType ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public BigMac build() {
        return new BigMac(roll, burgers, sauce, ingredients);
    }
}
