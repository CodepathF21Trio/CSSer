package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class ConverterActivity extends AppCompatActivity{
    private Button rgbToHex;
    private Button hexToRgb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        // connect variable to the proper item in the layout
        rgbToHex = findViewById(R.id.btnRGBtoHEX);
        hexToRgb = findViewById(R.id.btnHEXtoRGB);

        rgbToHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRGBtoHEX();
            }
        });

        hexToRgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHEXtoRGB();
            }
        });

    }

    private void openHEXtoRGB() {
        Intent i = new Intent(ConverterActivity.this, HEXtoRGB.class );
        startActivity(i);
    }

    private void openRGBtoHEX() {
        Intent i = new Intent(ConverterActivity.this, RGBtoHEX.class );
        startActivity(i);
    }


}