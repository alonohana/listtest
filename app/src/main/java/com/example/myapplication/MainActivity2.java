package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<String> countryInfoList;
    ArrayList<String> countryNames;
    ArrayList<Integer> flagid;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize country information
        countryNames = new ArrayList<>();
        countryNames.add("American Samoa");
        countryNames.add("Bolivia");
        countryNames.add("Chile");
        countryNames.add("Cook Islands");
        countryNames.add("Costa Rica");
        countryNames.add("Dominican Republic");
        countryNames.add("Ecuador");
        countryNames.add("Estonia");
        countryNames.add("Faroe Islands");
        countryNames.add("Falkland Islands");
        countryNames.add("Micronesia");
        countryNames.add("French Polynesia");
        countryNames.add("Greenland");
        countryNames.add("Guam");
        countryInfoList = new ArrayList<>();
        countryInfoList.add("American Samoa population: 50000 gdp: 5000");
        countryInfoList.add("Bolivia population: 11000000 gdp: 2800");
        countryInfoList.add("Chile population: 19000000 gdp: 15500");
        countryInfoList.add("Cook Islands population: 18000 gdp: 18000");
        countryInfoList.add("Costa Rica population: 5000000 gdp: 11600");
        countryInfoList.add("Dominican Republic population: 11000000 gdp: 8100");
        countryInfoList.add("Ecuador population: 17000000 gdp: 6300");
        countryInfoList.add("Estonia population: 1300000 gdp: 25700");
        countryInfoList.add("Faroe Islands population: 53000 gdp: 52000");
        countryInfoList.add("Falkland Islands population: 3000 gdp: 46000");
        countryInfoList.add("Micronesia population: 110000 gdp: 3200");
        countryInfoList.add("French Polynesia population: 280000 gdp: 17500");
        countryInfoList.add("Greenland population: 56000 gdp: 42000");
        countryInfoList.add("Guam population: 170000 gdp: 36000");
        flagid = new ArrayList<>();
        flagid.add(R.drawable.as);  // American Samoa
        flagid.add(R.drawable.bl);  // Bolivia
        flagid.add(R.drawable.cl);  // Chile
        flagid.add(R.drawable.ck);  // Cook Islands
        flagid.add(R.drawable.cr);  // Costa Rica
        flagid.add(R.drawable.dm);  // Dominican Republic
        flagid.add(R.drawable.ec);  // Ecuador
        flagid.add(R.drawable.et);  // Estonia
        flagid.add(R.drawable.fo);  // Faroe Islands
        flagid.add(R.drawable.fk);  // Falkland Islands
        flagid.add(R.drawable.fm);  // Micronesia
        flagid.add(R.drawable.pf);  // French Polynesia
        flagid.add(R.drawable.gl);  // Greenland
        flagid.add(R.drawable.gu);  // Guam
        ListView listView = findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, countryNames);
        listView.setAdapter(adapter);

        // Set item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position != -1) {
                    showToast(String.valueOf(countryInfoList.get(position)));
                }
                img = findViewById(R.id.imageView2);
                img.setImageResource(flagid.get(position));
            }
        });
    }
    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
