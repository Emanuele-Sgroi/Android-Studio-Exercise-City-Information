package com.example.cityinformation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CityActivity extends AppCompatActivity{
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_city);
        Button buttonBack = findViewById(R.id.buttonBack);
        TextView cityTitle = findViewById(R.id.cityTitle);
        TextView textCityInfo = findViewById(R.id.textCityInfo);
        ImageView imageCity = findViewById(R.id.imageCity);

        // Get city name
        String cityName = getIntent().getStringExtra("cityName");

        // Set title text accordingly
        cityTitle.setText(cityName);

        // Set image and text based on city
        if (cityName.equals("Rome")) {
            imageCity.setImageResource(R.drawable.rome);
            textCityInfo.setText("Known as the Eternal City, Rome is a treasure trove of history and architecture. It’s home to iconic landmarks such as the Colosseum, the Pantheon, and Vatican City, making it a must-visit for lovers of history and culture.");
        } else if (cityName.equals("Venice")) {
            imageCity.setImageResource(R.drawable.venice);
            textCityInfo.setText("Famous for its winding canals and romantic gondola rides, Venice is a unique floating city built on water. Highlights include St. Mark’s Basilica, the Grand Canal, and the annual Carnival with its elaborate masks.");
        } else if (cityName.equals("Florence")) {
            imageCity.setImageResource(R.drawable.florence);
            textCityInfo.setText("The birthplace of the Renaissance, Florence is renowned for its art, architecture, and culture. The Uffizi Gallery, the Florence Cathedral, and Michelangelo’s David are just a few gems of this historic city.");
        } else if (cityName.equals("London")) {
            imageCity.setImageResource(R.drawable.london);
            textCityInfo.setText("The bustling capital of England, London is a vibrant mix of history and modernity. Landmarks such as Big Ben, Buckingham Palace, and the London Eye attract millions of visitors each year.");
        } else if (cityName.equals("Manchester")) {
            imageCity.setImageResource(R.drawable.manchester);
            textCityInfo.setText("Known for its rich industrial heritage, Manchester is a hub for music, culture, and sports. It’s home to two world-famous football clubs, Manchester United and Manchester City, as well as a thriving arts scene.");
        } else if (cityName.equals("Liverpool")) {
            imageCity.setImageResource(R.drawable.liverpool);
            textCityInfo.setText("A city with deep maritime roots, Liverpool is celebrated for its music, being the birthplace of The Beatles. The Royal Albert Dock and its waterfront are UNESCO World Heritage Sites.");
        } else if (cityName.equals("Paris")) {
            imageCity.setImageResource(R.drawable.paris);
            textCityInfo.setText("The City of Love and Lights, Paris is synonymous with romance, fashion, and art. Landmarks like the Eiffel Tower, the Louvre Museum, and Notre-Dame Cathedral define its timeless appeal.");
        } else if (cityName.equals("Lyon")) {
            imageCity.setImageResource(R.drawable.lyon);
            textCityInfo.setText("Known as the gastronomic capital of France, Lyon is famous for its culinary scene, historic architecture, and vibrant culture. Its Old Town, a UNESCO World Heritage Site, is full of charm.");
        } else if (cityName.equals("Marseille")) {
            imageCity.setImageResource(R.drawable.marseille);
            textCityInfo.setText("A port city on the Mediterranean coast, Marseille boasts stunning sea views and rich multicultural heritage. Highlights include the Old Port, the vibrant markets, and the impressive Basilica of Notre-Dame de la Garde.");
        }

        buttonBack.setOnClickListener(v -> finish());
    }
}
