package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Call extends AppCompatActivity {

    ImageButton end;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);

        end = findViewById(R.id.end);

        end.setOnClickListener(view -> {
            Intent intent = new Intent(Call.this, Phone.class);
            startActivity(intent);
        });
    }
}
