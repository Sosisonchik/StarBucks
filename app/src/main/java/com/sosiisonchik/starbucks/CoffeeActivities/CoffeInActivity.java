package com.sosiisonchik.starbucks.CoffeeActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.sosiisonchik.starbucks.R;

public class CoffeInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe_in);
        Intent intent = getIntent();
        int i = (Integer) intent.getExtras().get("number");
        Coffee coffee = Coffee.coffees[i];
        String text = coffee.getDescription();
        int res = coffee.getImage();
        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(text);
        imageView.setImageResource(res);

    }
}
