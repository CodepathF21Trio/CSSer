package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class RGBtoHEX extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar red, green, blue;
    TextView tvRed, tvGreen, tvBlue, Hex, Color;
    int r=0, g=0, b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgbto_hex);

        red = (SeekBar) findViewById(R.id.sbRed);
        green = (SeekBar) findViewById(R.id.sbGreen);
        blue = (SeekBar) findViewById(R.id.sbBlue);

        Hex = (TextView) findViewById(R.id.tvHex);
        Color = (TextView) findViewById(R.id.tvColor);
        tvRed = (TextView) findViewById(R.id.tvRed);
        tvGreen = (TextView) findViewById(R.id.tvGreen);
        tvBlue = (TextView) findViewById(R.id.tvBlue);

        red.setOnSeekBarChangeListener(this);
        green.setOnSeekBarChangeListener(this);
        blue.setOnSeekBarChangeListener(this);
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bool) {
        switch (seekBar.getId()){
            case R.id.sbRed:
                r=i;
                break;
            case R.id.sbGreen:
                g=i;
                break;
            case R.id.sbBlue:
                b=i;
                break;
        }
        String c=ColorHex(r,g,b);
        Hex.setText("HEX: "+c);
        Color.setBackgroundColor(android.graphics.Color.rgb(r,g,b));

    }
    public String ColorHex(int r, int g, int b){
        String color="";
        color="#";
        color+=Integer.toHexString(r);
        color+=Integer.toHexString(g);
        color+=Integer.toHexString(b);
        return color;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        tvRed.setText("R: "+r);
        tvGreen.setText("G: "+g);
        tvBlue.setText("B: "+b);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        tvRed.setText("R: "+r);
        tvGreen.setText("G: "+g);
        tvBlue.setText("B: "+b);

    }
}