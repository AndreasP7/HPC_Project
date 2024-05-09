package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CallSOS extends AppCompatActivity {

    ImageButton end;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_sos);

        end = findViewById(R.id.end);

        end.setOnClickListener(view -> {
            Intent intent = new Intent(CallSOS.this, SOS.class);
            startActivity(intent);
        });
    }
}
