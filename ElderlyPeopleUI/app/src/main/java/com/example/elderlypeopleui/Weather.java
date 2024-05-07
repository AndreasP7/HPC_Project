package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class Weather extends AppCompatActivity {
    ImageButton imgButton;

    TextView title;

    LinearLayout toolbar;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);
        title = findViewById(R.id.title);
        title.setText("ΚΑΙΡΟΣ ΣΗΜΕΡΑ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.blue));

        imgButton = (ImageButton) findViewById(R.id.arrow_back);


        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Weather.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
