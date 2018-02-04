package com.sosiisonchik.starbucks.CoffeeActivities;


import com.sosiisonchik.starbucks.R;

public class Coffee {
    String description;
    int image;

    public Coffee(String description, int image) {
        this.description = description;
        this.image = image;
    }

    public static final Coffee[] coffees  = {new Coffee("This is latte", R.drawable.latte),
    new Coffee("This is Cappuccino",R.drawable.cappuccino),
            new Coffee("This is Filter",R.drawable.filter)};

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
