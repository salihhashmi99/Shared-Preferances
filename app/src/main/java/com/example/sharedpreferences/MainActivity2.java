package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences getShared = getSharedPreferences("Weather",MODE_PRIVATE);
        Boolean checkisRain = getShared.getBoolean("rain", false);

        if (checkisRain){
            Toast.makeText(this, "Yes it is raining", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "No it is not raining", Toast.LENGTH_SHORT).show();
        }
    }
}