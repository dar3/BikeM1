package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate()");

        Log.d("MainActivity", "Test" + "123");

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }


            public void openActivity2 (){
                Intent intent = new Intent(this, Delays.class);
                startActivity(intent);
            }

        });
        button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           openActivity3();
            }
            public void  openActivity3(){
                Intent intent = new Intent(this, Timetable.class);
                startActivity(intent);
            }

        });

            }
            }






   /* button2  = (Button) findViewById(R.id.button3);
    button.setonClickListener(new View.OnClickListener)(){
        @Override
                public void onClick(View v){}
    } */
