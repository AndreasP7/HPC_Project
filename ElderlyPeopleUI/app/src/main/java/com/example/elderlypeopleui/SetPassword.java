package com.example.elderlypeopleui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SetPassword extends AppCompatActivity {
    Button setBtn;
    EditText setPass;
    EditText currentPass;
    TextView title;
    LinearLayout toolbar;
    String password ;
    String newPassword;
    String givenCurrent;
    SharedPreferences sharedPreferences;

    boolean signedUp;
    boolean match = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_password);
        title = findViewById(R.id.title);
        title.setText("ΡΥΘΜΙΣΕΙΣ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.grey));

        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        password = sharedPreferences.getString("password", "null");

        setBtn = findViewById(R.id.setPassBtn);
        setPass = findViewById(R.id.setPassInput);
        currentPass = findViewById(R.id.currentPass);

        signedUp = !password.equals("null");


        if (signedUp){
            currentPass.setVisibility(View.VISIBLE);
        }

        setBtn.setOnClickListener(view -> {
            newPassword = setPass.getText().toString();
            if(signedUp){
                givenCurrent = currentPass.getText().toString();
                match = givenCurrent.equals(password);

            }
            if(signedUp&&match || !signedUp){
                editor.putString("password",newPassword);
                editor.apply();
                Intent intent = new Intent(SetPassword.this, LogIn.class);
                startActivity(intent);

            }
        });



    }
}