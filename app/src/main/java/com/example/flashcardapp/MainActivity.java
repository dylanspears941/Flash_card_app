package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flashcardQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcardQ).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcardA).setVisibility(View.VISIBLE);
            }

        });
        findViewById(R.id.flashcardA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcardA).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcardQ).setVisibility(View.VISIBLE);
            }
        });

}}