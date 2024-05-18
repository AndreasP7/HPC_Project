package com.example.elderlypeopleui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherMain extends AppCompatActivity {
    private final static  String requestURL = "https://api.openweathermap.org/data/2.5/weather?q=Athens&appid=3fcb1b9034d6cfa451d811886b861d15";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);

        WeatherAsyncTask weatherAsyncTask = new WeatherAsyncTask();
        weatherAsyncTask.execute(requestURL);
    }


    private class WeatherAsyncTask extends AsyncTask<String, Void, Weather> {

        protected Weather doInBackground(String... urls){
            if(urls==null || urls.length <1 ){
                return null;
            }
            Weather weather = null;
            try{
                weather = WeatherU.FetchWeatherData(urls[0]);
            }catch (MalformedURLException e) {
                e.printStackTrace();
            }

            return weather;

        }

        protected void onPostExecute(Weather weather){
            if(weather==null){
                return;
            }
            UpdateUI(weather);
        }

    }


    private void UpdateUI(Weather weather){
        TextView cityName= findViewById(R.id.textView5);
        cityName.setText(weather.getCity());

        TextView temp= findViewById(R.id.textView4);
        temp.setText(weather.getTemp() +"°C");

        TextView desc= findViewById(R.id.textView3);
        desc.setText(weather.getDescription());

        TextView humidity= findViewById(R.id.textView6);
        humidity.setText(weather.getHumidity()+"%");


        TextView date = findViewById(R.id.textView2);
        long time = weather.getDate()*1000;
        Date dateObject  = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE , MMM dd, yyy");
        String currentDate = simpleDateFormat.format(dateObject);
        date.setText(currentDate);



    }
}
