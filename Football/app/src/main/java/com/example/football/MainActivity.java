package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer GeassPoint = 0;
    private Integer FTPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addPointGeass(View view){
        GeassPoint++;
        TextView counterGeassPoint = (TextView)findViewById(R.id.GeassPoint);
        counterGeassPoint.setText(GeassPoint.toString());
    }
    public void addPointFT(View view){
        FTPoint++;
        TextView counterFTPoint = (TextView)findViewById(R.id.FTPoint);
        counterFTPoint.setText(FTPoint.toString());
    }
    public void reset(View view){
        GeassPoint = 0;
        TextView counterGeassPoint = (TextView)findViewById(R.id.GeassPoint);
        counterGeassPoint.setText(GeassPoint.toString());
        FTPoint = 0;
        TextView counterFTPoint = (TextView)findViewById(R.id.FTPoint);
        counterFTPoint.setText(FTPoint.toString());
    }
    @Override
    protected void onResume() {
        super.onResume();
        resetUI();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("pointGP", GeassPoint);
        outState.putInt("pointFT", FTPoint);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("pointGP")&&savedInstanceState.containsKey("pointFT")) {
            GeassPoint = savedInstanceState.getInt("pointGP");
            FTPoint = savedInstanceState.getInt("pointFT");
        }
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.GeassPoint)).setText("" + GeassPoint);
        ((TextView) findViewById(R.id.FTPoint)).setText("" + FTPoint);
    }


}