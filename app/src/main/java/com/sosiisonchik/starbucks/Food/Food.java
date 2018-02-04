package com.sosiisonchik.starbucks.Food;


import com.sosiisonchik.starbucks.R;

public class Food {
    String name;
    String decription;
    int image;

    public static final Food[] foods = {new Food("Cake","This is cake", R.drawable.cake),
    new Food("Cookie","This is cookie",R.drawable.cookie),
    new Food("Muffin","This is muffin",R.drawable.muffin)};
    private Food(String name, String decription, int image) {
        this.name = name;
        this.decription = decription;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDecription() {
        return decription;
    }

    public int getImage() {
        return image;
    }
}
