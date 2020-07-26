package com.hfad.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "a couple espresso shots with streamed milk", R.drawable.latte),
            new Drink("Cappuccino","espresso, hot milk, and a steamed milk foam.", R.drawable.cappuccino),
            new Drink("Filter", "highest quality beans roasted and brewed fresh", R.drawable.filter)};

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.getImageResourceId();
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                '}';
    }
}
