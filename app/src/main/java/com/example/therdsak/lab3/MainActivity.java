package com.example.therdsak.lab3;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.go_pref_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PrefActivity.class));
            }
        });
    }
    private static final String TAG = "MainActivity";

    @Override
    protected void onResume() {
        super.onResume();

        //เอาไว้เก้บข้อมูลใน app ถึงปิดไปก็เก็บอยู่ SharedPreferences
        SharedPreferences pm = PreferenceManager.getDefaultSharedPreferences(this);
        String pref1KeyValue = pm.getString("pref_1_key", null);
        Log.i(TAG, "Pref 1 Key: " + pref1KeyValue);


    }
}
