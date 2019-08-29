package com.nathan.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "The Main Activity has started");
    }
}
