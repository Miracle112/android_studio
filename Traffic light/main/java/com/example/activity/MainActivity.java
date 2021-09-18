package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view) {
        LinearLayout constraintLayout = findViewById(R.id.hop);
        constraintLayout.setBackgroundResource(R.color.red);
    }
    public void blue(View view) {
        LinearLayout constraintLayout = findViewById(R.id.hop);
        constraintLayout.setBackgroundResource(R.color.blue);
    }
    public void yellow(View view) {
        LinearLayout constraintLayout = findViewById(R.id.hop);
        constraintLayout.setBackgroundResource(R.color.yellow);
    }
}