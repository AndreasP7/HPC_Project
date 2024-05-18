package com.example.elderlypeopleui;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;


public class WeatherU {

    public static Weather FetchWeatherData(String requestURL) throws MalformedURLException{
        URL url = CreateURL(requestURL);

        String jsonResponse = null;
        try{
            jsonResponse=CreateHTTPRequest(url);

        } catch (IOException e){
            e.printStackTrace();
        }

        Weather weatherData = ExtractFieldsFromJson(jsonResponse);
        return weatherData;
    }

    private static URL CreateURL(String requestURL) throws MalformedURLException{
        URL url = null;
        if(requestURL== null){
            return null;
        }
        url = new URL(requestURL);
        return url;

    }

    private static String CreateHTTPRequest(URL url) throws IOException{
        String jsonResponse= "";
        if(url== null ){
            return jsonResponse;
        }

        HttpURLConnection httpURLConnection= null;
        InputStream inputStream=null;

        try{
            httpURLConnection= (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode()==200){
                inputStream = httpURLConnection.getInputStream();
                jsonResponse = ReadFromInputStream(inputStream);
            }else{
                Log.d("WeatherU","Response error"+ httpURLConnection.getResponseCode());
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (httpURLConnection != null){
                httpURLConnection.disconnect();
            }
            if(inputStream != null){
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private static String ReadFromInputStream(InputStream inputStream) throws  IOException{
        StringBuilder outputResponse = new StringBuilder();
        if(inputStream != null ){
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line  = bufferedReader.readLine();
            while(line != null){
                outputResponse.append(line);
                line= bufferedReader.readLine();

            }
        }
        return outputResponse.toString();
    }

    private static Weather ExtractFieldsFromJson(String response ){
        if(TextUtils.isEmpty(response)){
            return null;
        }
        try{
            JSONObject baseJsonObject = new JSONObject(response);
            String cityName = baseJsonObject.getString("name");
            long date= baseJsonObject.getLong("dt");
            JSONArray weatherJsonArray = baseJsonObject.getJSONArray("weather");
            JSONObject currentWeather = weatherJsonArray.getJSONObject(0);
            String description = currentWeather.getString("description");
            String iconID = currentWeather.getString("icon");

            JSONObject mainJsonObject = baseJsonObject.getJSONObject("main");
            String temp = mainJsonObject.getString("temp");
            String humidity = mainJsonObject.getString("humidity");

            Weather extractedData = new Weather(temp, cityName, description, humidity, date, iconID);
            return extractedData;

        }catch (JSONException e){
            e.printStackTrace();
        }
        return null;
    }

}
