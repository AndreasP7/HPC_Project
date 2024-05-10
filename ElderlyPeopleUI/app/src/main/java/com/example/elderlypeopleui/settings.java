package com.example.elderlypeopleui;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class settings extends AppCompatActivity {

    ImageButton imgButton;
    TextView title;
    LinearLayout toolbar;

    LinearLayout set;
    TextView name;
    ImageView image;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        title = findViewById(R.id.title);
        title.setText("ΡΥΘΜΙΣΕΙΣ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.grey));

        set = findViewById(R.id.set1);
        name = set.findViewById(R.id.name);
        name.setText("ΕΠΑΦΕΣ");
        set = findViewById(R.id.set2);
        name = set.findViewById(R.id.name);
        name.setText("ΣΤΟΙΧΕΙΑ");
        set = findViewById(R.id.set3);
        name = set.findViewById(R.id.name);
        name.setText("ΓΕΝΙΚΕΣ ΡΥΘΜΙΣΕΙΣ");
        name.setTextSize(50);
        set = findViewById(R.id.set4);
        name = set.findViewById(R.id.name);
        name.setText("ΡΥΘΜΙΣΕΙΣ ΔΙΚΤΥΟΥ");
        name.setTextSize(50);
        set = findViewById(R.id.set5);
        name = set.findViewById(R.id.name);
        name.setText("ΡΥΘΜΙΣΕΙΣ ΩΡΑΣ");
        name.setTextSize(52);


        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(settings.this, HomeSecond.class);
            startActivity(intent);
        });


    }
}
