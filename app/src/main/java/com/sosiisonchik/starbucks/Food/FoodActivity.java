package com.sosiisonchik.starbucks.Food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sosiisonchik.starbucks.MainActivity;
import com.sosiisonchik.starbucks.R;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ListView fooList = (ListView)findViewById(R.id.foods);
        fooList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FoodActivity.this,FoodInActivity.class);
                intent.putExtra("number",i);
                startActivity(intent);
            }
        });

    }
}
