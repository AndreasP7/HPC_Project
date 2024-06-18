package com.example.elderlypeopleui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Console;

public class LogIn extends AppCompatActivity {

    TextView title;
    LinearLayout toolbar;
    ImageButton imgButton;
    Button loginBtn;
    Button changeBtn;

    String password ;
    EditText passInput ;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);

        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        password = sharedPreferences.getString("password", "null");

        title = findViewById(R.id.title);
        title.setText("ΡΥΘΜΙΣΕΙΣ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.grey));

        loginBtn = findViewById(R.id.loginBtn);
        changeBtn = findViewById(R.id.changePasswordBtn);
        passInput = findViewById(R.id.loginInput);

        loginBtn.setOnClickListener(view -> {

            if(passInput.getText().toString().equals(password)){
                Intent intent = new Intent(LogIn.this, settings.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(LogIn.this, "ΛΑΘΟΣ ΣΥΝΘΗΜΑΤΙΚΟ", Toast.LENGTH_SHORT).show();
            }

        });

        changeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(LogIn.this, SetPassword.class);
            startActivity(intent);
        });

        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(LogIn.this, HomeSecond.class);
            startActivity(intent);
        });


    }


}