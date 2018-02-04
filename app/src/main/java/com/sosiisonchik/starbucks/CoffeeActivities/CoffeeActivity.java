package com.sosiisonchik.starbucks.CoffeeActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sosiisonchik.starbucks.R;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        ListView coffees = (ListView)findViewById(R.id.coffees);
        coffees.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(CoffeeActivity.this,CoffeInActivity.class);
                    intent.putExtra("number",i);
                    startActivity(intent);
            }
        });
    }
}
