package com.example.elderlypeopleui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Me extends AppCompatActivity {

    ImageButton imgButton;
    TextView title;
    LinearLayout toolbar;
    LinearLayout field;
    TextView value;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);
        title = findViewById(R.id.title);
        title.setText("ΣΤΟΙΧΕΙΑ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));

        field = findViewById(R.id.field1);
        value = field.findViewById(R.id.name);
        value.setText("ΟΝΟΜΑ: \nΛΑΖΑΡΟΣ");
        field = findViewById(R.id.field2);
        value = field.findViewById(R.id.name);
        value.setText("ΕΠΙΘΕΤΟ: \nΑΝΔΡΙΑΝΟΣ");
        field = findViewById(R.id.field3);
        value = field.findViewById(R.id.name);
        value.setText("ΑΜΚΑ: \n05025000382");
        field = findViewById(R.id.field4);
        value = field.findViewById(R.id.name);
        value.setText("ΑΦΜ: \n785869345");
        field = findViewById(R.id.field5);
        value = field.findViewById(R.id.name);
        value.setText("ΤΑΥΤΟΤΗΑ: \nΑΒ 23671");

        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Me.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
