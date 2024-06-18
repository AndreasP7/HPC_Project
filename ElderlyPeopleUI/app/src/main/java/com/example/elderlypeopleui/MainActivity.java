package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton imgButton;
    androidx.cardview.widget.CardView phone;
    androidx.cardview.widget.CardView sos;
    androidx.cardview.widget.CardView me;
    androidx.cardview.widget.CardView map;
    androidx.cardview.widget.CardView weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.top_view), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgButton = (ImageButton) findViewById(R.id.arrow_down);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HomeSecond.class);
            startActivity(intent);
        });

        phone = (androidx.cardview.widget.CardView) findViewById(R.id.phone);

        phone.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Phone.class);
            startActivity(intent);
        });

        sos = (androidx.cardview.widget.CardView) findViewById(R.id.sos);

        sos.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SOS.class);
            startActivity(intent);
        });

        me = (androidx.cardview.widget.CardView) findViewById(R.id.me);

        me.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Me.class);
            startActivity(intent);
        });

        map = (androidx.cardview.widget.CardView) findViewById(R.id.map);

        map.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Map.class);
            startActivity(intent);
        });

        weather = (androidx.cardview.widget.CardView) findViewById(R.id.weather);

        weather.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Weather.class);
            startActivity(intent);
        });
    }
}