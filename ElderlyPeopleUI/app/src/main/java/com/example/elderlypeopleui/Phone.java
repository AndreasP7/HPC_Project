package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Phone extends AppCompatActivity {

    ImageButton imgButton;
    TextView title;
    LinearLayout toolbar;

    LinearLayout contact;
    TextView name;
    ImageView image;
    LinearLayout call;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);
        title = findViewById(R.id.title);
        title.setText("ΤΗΛΕΦΩΝΟ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.green));

        contact = findViewById(R.id.contact1);
        name = contact.findViewById(R.id.name);
        name.setText("ΚΟΡΗ");
        contact = findViewById(R.id.contact2);
        name = contact.findViewById(R.id.name);
        name.setText("ΣΥΖΥΓΟΣ");
        contact = findViewById(R.id.contact3);
        name = contact.findViewById(R.id.name);
        name.setText("ΓΑΜΠΡΟΣ");
        contact = findViewById(R.id.contact4);
        name = contact.findViewById(R.id.name);
        name.setText("ΕΓΓΟΝΙ");
        contact = findViewById(R.id.contact5);
        name = contact.findViewById(R.id.name);
        name.setText("ΕΠΙΛΟΓΗ");
        image = contact.findViewById(R.id.image);
        contact.removeView(image);

        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Phone.this, MainActivity.class);
            startActivity(intent);
        });

        call = findViewById(R.id.contact1);

        call.setOnClickListener(view -> {
            Intent intent = new Intent(Phone.this, Call.class);
            startActivity(intent);
        });
    }
}
