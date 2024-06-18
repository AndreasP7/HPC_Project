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

    private String temp;
    private String city;
    private String description;
    private String humidity;
    private long date;
    private String icon;

    public Weather(String temp, String city, String description, String humidity, long date, String icon) {
        this.temp = temp;
        this.city = city;
        this.description = description;
        this.humidity = humidity;
        this.date = date;
        this.icon = icon;
    }

    public String getTemp() {
        return temp;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getHumidity() {
        return humidity;
    }

    public long getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);
        title = findViewById(R.id.title);
        title.setText("ΚΑΙΡΟΣ ΣΗΜΕΡΑ");
        title.setTextSize(32);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.blue));

        imgButton = (ImageButton) findViewById(R.id.arrow_back);


        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Weather.this, HomeSecond.class);
            startActivity(intent);
        });
    }
}
