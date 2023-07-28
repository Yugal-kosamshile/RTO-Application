package com.example.rto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button rules;
    Button violation;
    Button office;
    Button about;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rules=(Button) findViewById(R.id.button);
        violation=(Button) findViewById(R.id.button2);
        office=(Button) findViewById(R.id.button3);
        about=(Button) findViewById(R.id.button4);

        rules.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Rules_activity.class);
            startActivity(intent);

        });


        violation.setOnClickListener(v1 -> {
            Intent intent1 = new Intent(MainActivity.this,Violation_activity.class);
            startActivity(intent1);

        });


        office.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Office_activity.class);
            startActivity(intent);
        });

        about.setOnClickListener(v -> {
            Intent intent2 = new Intent (MainActivity.this,About_activity.class);
            startActivity (intent2);

        });
    }

}