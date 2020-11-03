package com.mobdeve.tighee.firstapp;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declare variables that will allow use to interact with the UI elements
    private EditText first_name_et;
    private EditText last_name_et;
    private Button add_btn;
    private LinearLayout name_list_vll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize our variables by finding the ID of each UI element
        this.first_name_et = (EditText) findViewById(R.id.firstname_etv);
        this.last_name_et = (EditText) findViewById(R.id.lastname_etv);
        this.add_btn = (Button) findViewById(R.id.add_btn);
        this.name_list_vll = (LinearLayout) findViewById(R.id.namelist_vll);

        /* Create an event listener (OnClick) that performs:
            (1) Create a new TextView (temp_tv) given the context of our current Activity
            (2) Sets the text attribute by concatenating the text attributes from
                first_name_et and last_name_et
            (3) Add the TextView to the LinearLayout (name_list_vll)
        */
        this.add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView temp_tv = new TextView(getApplicationContext());
                temp_tv.setText(last_name_et.getText() + ", " + first_name_et.getText());
                name_list_vll.addView(temp_tv);
            }
        });

        /*Toast t = Toast.makeText(
                getApplicationContext(),
                R.string.random_text,
                Toast.LENGTH_LONG
        );
        t.show();*/
    }
}


