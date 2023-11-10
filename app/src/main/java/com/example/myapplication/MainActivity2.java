package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<String> cname = new ArrayList<>();
        cname.add("American Samoa");
        cname.add("Bolivia");
        cname.add("Chile");
        cname.add("Cook Islands");
        cname.add("Costa Rica");
        cname.add("Dominican Republic");
        cname.add("Ecuador");
        cname.add(" Estonia");
        cname.add("Faroe Islands");
        cname.add(" Falkland Islands");
        cname.add("Micronesia");
        cname.add("French Polynesia");
        cname.add(" Greenland");
        cname.add(" Guam");
        ListView l = findViewById(R.id.lv);
        ArrayAdapter t = new ArrayAdapter(getApplicationContext(),R.layout.itmes,cname);
        l.setAdapter(t);



    }
}