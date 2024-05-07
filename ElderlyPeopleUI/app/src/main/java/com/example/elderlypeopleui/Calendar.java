package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Calendar extends AppCompatActivity {

    ImageButton imgButton;
    TextView title;
    LinearLayout toolbar;
    LinearLayout date;
    TextView day;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);
        title = findViewById(R.id.title);
        title.setText("ΗΜΕΡΟΛΟΓΙΟ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));

        date = findViewById(R.id.date1);
        day = date.findViewById(R.id.day);
        day.setText("fwefwefwef");
        date = findViewById(R.id.date2);
        day = date.findViewById(R.id.day);
        day.setText("ΕΠΙΘΕΤΟ: \nΑΝΔΡΙΑΝΟΣ");
        date = findViewById(R.id.date3);
        day = date.findViewById(R.id.day);
        day.setText("ΑΜΚΑ: \n05025000382");
        date = findViewById(R.id.date4);
        day = date.findViewById(R.id.day);
        day.setText("ΑΦΜ: \n785869345");
        date = findViewById(R.id.date5);
        day = date.findViewById(R.id.day);
        day.setText("ΤΑΥΤΟΤΗΑ: \nΑΒ 23671");

        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Calendar.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
