package com.example.stck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.hardware.lights.LightState;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Version> versionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.rec1);
        initData();
        setRecyclerView();

    }

    private void setRecyclerView(){
        versionsadapter VersionAdapter = new versionsadapter(versionList);
        recyclerView.setAdapter(VersionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        versionList = new ArrayList<>();

        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));
        versionList.add(new Version("What is stock market?","Stock market is shgikushgkhsjkhgkjhgkjhskjghksjhgjkshgjkhlkjh"));


    }


}