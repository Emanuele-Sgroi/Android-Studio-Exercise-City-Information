package com.example.cityinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewCities;
    private CardView cardViewCities;
    private RadioGroup radioGroupCountries;
    private Button buttonReset;

    // City Data
    private final String[] italyCities = {"Rome", "Venice", "Florence"};
    private final String[] englandCities = {"London", "Manchester", "Liverpool"};
    private final String[] franceCities = {"Paris", "Lyon", "Marseille"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewCities = findViewById(R.id.listViewCities);
        cardViewCities = findViewById(R.id.cardViewCities);
        radioGroupCountries = findViewById(R.id.radioGroupCountries);
        buttonReset = findViewById(R.id.buttonReset);

        // Show cities dynamically
        radioGroupCountries.setOnCheckedChangeListener((group, checkedId) -> {
            String[] cities = {};
            if (checkedId == R.id.radioItaly) {
                cities = italyCities;
            } else if (checkedId == R.id.radioEngland) {
                cities = englandCities;
            } else if (checkedId == R.id.radioFrance) {
                cities = franceCities;
            }

            cardViewCities.setVisibility(View.VISIBLE);
            buttonReset.setVisibility(View.VISIBLE);
            listViewCities.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities));
        });

        // Handle city selection
        listViewCities.setOnItemClickListener((parent, view, position, id) -> {
            String city = (String) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainActivity.this, CityActivity.class);
            intent.putExtra("cityName", city);
            startActivity(intent);
        });

        // Reset button functionality
        buttonReset.setOnClickListener(v -> {
            radioGroupCountries.clearCheck();
            cardViewCities.setVisibility(View.GONE);
            buttonReset.setVisibility(View.GONE);
        });
    }
}
