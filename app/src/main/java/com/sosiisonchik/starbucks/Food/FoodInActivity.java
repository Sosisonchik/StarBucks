package com.sosiisonchik.starbucks.Food;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.sosiisonchik.starbucks.R;

public class FoodInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_in);
        Intent intent = getIntent();
        int i = (Integer) intent.getExtras().get("number");
        Food food = Food.foods[i];
        String text = food.getDecription();
        int res = food.getImage();
        TextView textView = (TextView)findViewById(R.id.textView5);
        textView.setText(text);
        ImageView image = (ImageView)findViewById(R.id.imageView3);
        image.setImageResource(res);
    }
}
