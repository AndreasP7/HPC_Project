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
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        title = findViewById(R.id.title);
        title.setText("ΗΜΕΡΟΛΟΓΙΟ");
        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.blue));

        date = findViewById(R.id.day1);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΔΕ");
        date = findViewById(R.id.day2);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΤΡ");
        date = findViewById(R.id.day3);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΤΕ");
        date = findViewById(R.id.day4);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΠΕ");
        date = findViewById(R.id.day5);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΠΑ");
        date = findViewById(R.id.day6);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΣΑ");
        date = findViewById(R.id.day7);
        date.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        day = date.findViewById(R.id.day);
        day.setText("ΚΥ");

        date = findViewById(R.id.dateg29);
        date.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        day = date.findViewById(R.id.day);
        day.setText("29");
        date = findViewById(R.id.dateg30);
        date.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        day = date.findViewById(R.id.day);
        day.setText("30");
        date = findViewById(R.id.date1);
        day = date.findViewById(R.id.day);
        day.setText("1");
        date = findViewById(R.id.date2);
        day = date.findViewById(R.id.day);
        day.setText("2");
        date = findViewById(R.id.date3);
        day = date.findViewById(R.id.day);
        day.setText("3");
        date = findViewById(R.id.date4);
        day = date.findViewById(R.id.day);
        day.setText("4");
        date = findViewById(R.id.date5);
        day = date.findViewById(R.id.day);
        day.setText("5");

        date = findViewById(R.id.date6);
        day = date.findViewById(R.id.day);
        day.setText("6");
        date = findViewById(R.id.date7);
        day = date.findViewById(R.id.day);
        day.setText("7");
        date = findViewById(R.id.date8);
        day = date.findViewById(R.id.day);
        day.setText("8");
        date = findViewById(R.id.date9);
        day = date.findViewById(R.id.day);
        day.setText("9");
        date = findViewById(R.id.date10);
        day = date.findViewById(R.id.day);
        day.setText("10");
        date = findViewById(R.id.date11);
        day = date.findViewById(R.id.day);
        day.setText("11");
        date = findViewById(R.id.date12);
        day = date.findViewById(R.id.day);
        day.setText("12");

        date = findViewById(R.id.date13);
        day = date.findViewById(R.id.day);
        day.setText("13");
        date = findViewById(R.id.date14);
        day = date.findViewById(R.id.day);
        day.setText("14");
        date = findViewById(R.id.date15);
        day = date.findViewById(R.id.day);
        day.setText("15");
        date = findViewById(R.id.date16);
        day = date.findViewById(R.id.day);
        day.setText("16");
        date = findViewById(R.id.date17);
        day = date.findViewById(R.id.day);
        day.setText("17");
        date = findViewById(R.id.date18);
        date.setBackgroundColor(getResources().getColor(R.color.pink));
        day = date.findViewById(R.id.day);
        day.setText("18");
        date = findViewById(R.id.date19);
        day = date.findViewById(R.id.day);
        day.setText("19");

        date = findViewById(R.id.date20);
        day = date.findViewById(R.id.day);
        day.setText("20");
        date = findViewById(R.id.date21);
        day = date.findViewById(R.id.day);
        day.setText("21");
        date = findViewById(R.id.date22);
        day = date.findViewById(R.id.day);
        day.setText("22");
        date = findViewById(R.id.date23);
        day = date.findViewById(R.id.day);
        day.setText("23");
        date = findViewById(R.id.date24);
        day = date.findViewById(R.id.day);
        day.setText("24");
        date = findViewById(R.id.date25);
        day = date.findViewById(R.id.day);
        day.setText("25");
        date = findViewById(R.id.date26);
        day = date.findViewById(R.id.day);
        day.setText("26");

        date = findViewById(R.id.date27);
        day = date.findViewById(R.id.day);
        day.setText("27");
        date = findViewById(R.id.date28);
        day = date.findViewById(R.id.day);
        day.setText("28");
        date = findViewById(R.id.date29);
        day = date.findViewById(R.id.day);
        day.setText("29");
        date = findViewById(R.id.date30);
        day = date.findViewById(R.id.day);
        day.setText("30");
        date = findViewById(R.id.date31);
        day = date.findViewById(R.id.day);
        day.setText("31");
        date = findViewById(R.id.dateg1);
        date.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        day = date.findViewById(R.id.day);
        day.setText("1");
        date = findViewById(R.id.dateg2);
        date.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        day = date.findViewById(R.id.day);
        day.setText("2");


        imgButton = findViewById(R.id.arrow_back);

        imgButton.setOnClickListener(view -> {
            Intent intent = new Intent(Calendar.this, HomeSecond.class);
            startActivity(intent);
        });
    }
}
