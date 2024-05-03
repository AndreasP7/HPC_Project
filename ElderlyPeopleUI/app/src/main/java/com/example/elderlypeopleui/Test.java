package com.example.elderlypeopleui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Test extends AppCompatActivity {

    Toolbar appbar;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.map);
        appbar = findViewById(R.id.appbar);
        setSupportActionBar(appbar);




    }
}
