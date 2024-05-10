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
    TextView nameday;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        title = findViewById(R.id.title);
        title.setText("ΗΜΕΡΟΛΟΓΙΟ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));

        date = findViewById(R.id.date1);
        date.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΚΥΡΙΑΚΗ 21 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Αλεξάνδρα, Σάντρα, Σάσα, Ιανουάριος, Ιανός, Φαίστος");
        date = findViewById(R.id.date2);
        date.setBackgroundColor(getResources().getColor(R.color.darkRed));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΔΕΥΤΕΡΑ 22 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Νέαρχος, Νιάρχος, Ναθαναήλ, Ναθάνης, ");
        date = findViewById(R.id.date3);
        date.setBackgroundColor(getResources().getColor(R.color.olive));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΤΡΙΤΗ 23 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΠΑΓΚΟΣΜΙΑ ΗΜΕΡΑ ΒΙΒΛΙΟΥ");
        date = findViewById(R.id.date4);
        date.setBackgroundColor(getResources().getColor(R.color.pink));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΤΕΤΑΡΤΗ 24 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Αχιλλέας, Δούκας, Βαλεντίνα, Ελίζα, Ζέτα, Βέτα, Μπέττυ, Ελισσάβετ, Θαυμαστός");
        date = findViewById(R.id.date5);
        date.setBackgroundColor(getResources().getColor(R.color.orange));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΠΕΜΠΤΗ 25 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Νίκη");
        date = findViewById(R.id.date6);
        date.setBackgroundColor(getResources().getColor(R.color.turquoise));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΠΑΡΑΣΚΕΥΗ 26 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Γλαφυρός, Γλαφύρα, Γλαφυρή, Γλαφυρούλα");
        date = findViewById(R.id.date7);
        date.setBackgroundColor(getResources().getColor(R.color.navyBlue));
        day = date.findViewById(R.id.day);
        nameday = date.findViewById(R.id.nameday);
        day.setText("ΣΑΒΒΑΤΟ 27 ΑΠΡΙΛΙΟΥ 2024");
        nameday.setText("ΓΙΟΡΤΕΣ: Λάζαρος, Λάζος, Λαζαρία, Λαζαρούλα");

        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Calendar.this, HomeSecond.class);
            startActivity(intent);
        });
    }
}
