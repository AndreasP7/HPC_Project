package com.example.elderlypeopleui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeSecond extends AppCompatActivity {
    ImageButton imgButton;
    androidx.cardview.widget.CardView weather;
    androidx.cardview.widget.CardView calendar;

    androidx.cardview.widget.CardView settings;

    SharedPreferences sharedPreferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.top_view), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);


        imgButton = (ImageButton) findViewById(R.id.arrow_up);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(HomeSecond.this, MainActivity.class);
            startActivity(intent);
        });

        weather = (androidx.cardview.widget.CardView) findViewById(R.id.weather);

        weather.setOnClickListener(view -> {
            Intent intent = new Intent(HomeSecond.this, Weather.class);
            startActivity(intent);
        });

        calendar = (androidx.cardview.widget.CardView) findViewById(R.id.calendar);

        calendar.setOnClickListener(view -> {
            Intent intent = new Intent(HomeSecond.this, Calendar.class);
            startActivity(intent);
        });

        settings = (androidx.cardview.widget.CardView) findViewById(R.id.settings);

        settings.setOnClickListener(view -> {
            if(sharedPreferences.contains("password")){
                Intent intent = new Intent(HomeSecond.this, LogIn.class);
                startActivity(intent);
            }
            else{
                Intent intent = new Intent(HomeSecond.this, SetPassword.class);
                startActivity(intent);
            }


        });
    }
}
