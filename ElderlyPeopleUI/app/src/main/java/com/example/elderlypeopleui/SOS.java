package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SOS extends AppCompatActivity {

    ImageButton imgButton;
    TextView title;
    LinearLayout toolbar;

    LinearLayout contact;
    TextView name;
    ImageView image;
    LinearLayout call;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sos);
        title = findViewById(R.id.title);
        title.setText("SOS");
        title.setTextColor(getResources().getColor(R.color.red));
        title.setTextSize(60);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.peach));

        contact = findViewById(R.id.contact1);
        name = contact.findViewById(R.id.name);
        name.setText("100");
        image = contact.findViewById(R.id.image);
        image.setImageResource(R.drawable.police);
        contact = findViewById(R.id.contact2);
        name = contact.findViewById(R.id.name);
        name.setText("166");
        image = contact.findViewById(R.id.image);
        image.setImageResource(R.drawable.hospital);
        contact = findViewById(R.id.contact3);
        name = contact.findViewById(R.id.name);
        name.setText("199");
        image = contact.findViewById(R.id.image);
        image.setImageResource(R.drawable.fire_department);
        contact = findViewById(R.id.contact4);
        name = contact.findViewById(R.id.name);
        name.setText("112");
        image = contact.findViewById(R.id.image);
        image.setImageResource(R.drawable.european_number);
        contact = findViewById(R.id.contact5);
        name = contact.findViewById(R.id.name);
        name.setText("ΙΑΤΡΟΣ");
        image = contact.findViewById(R.id.image);
        image.setImageResource(R.drawable.nurse);

        imgButton = (ImageButton) findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(SOS.this, MainActivity.class);
            startActivity(intent);
        });

        call = findViewById(R.id.contact5);

        call.setOnClickListener(view -> {
            Intent intent = new Intent(SOS.this, CallSOS.class);
            startActivity(intent);
        });
    }
}
