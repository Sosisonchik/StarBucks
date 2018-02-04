package com.sosiisonchik.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sosiisonchik.starbucks.CoffeeActivities.CoffeeActivity;
import com.sosiisonchik.starbucks.Food.FoodActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView prodList = (ListView)findViewById(R.id.products);
        prodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> prodList, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(MainActivity.this,CoffeeActivity.class);
                    startActivity(intent);
                }else if (i==1){
                    Intent intent = new Intent(MainActivity.this, FoodActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
