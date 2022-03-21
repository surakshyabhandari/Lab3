package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
    }

    public void launchHomework(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}