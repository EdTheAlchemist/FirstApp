package com.mobdeve.tighee.firstapp;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MAIN_ACTIVITY_LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(
                getApplicationContext(),
                "Hello world!",
                Toast.LENGTH_LONG
        );
        t.show();
    }
}