package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HEXtoRGB extends AppCompatActivity {

    TextView tvRed, tvGreen, tvBlue, Hex, Color;
    Button btnConvert;
    EditText etHex;
    int r=0, g=0, b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexto_rgb);

        etHex = (EditText) findViewById(R.id.etHex);


        btnConvert = (Button) findViewById(R.id.btnConvert);

        Hex = (TextView) findViewById(R.id.tvHex);
        Color = (TextView) findViewById(R.id.tvColor);
        tvRed = (TextView) findViewById(R.id.tvRed);
        tvGreen = (TextView) findViewById(R.id.tvGreen);
        tvBlue = (TextView) findViewById(R.id.tvBlue);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(convertHEXtoRGB(etHex)){
                    //set r, g, b and display
                    Color.setBackgroundColor(android.graphics.Color.rgb(r,g,b));
                    tvRed.setText("Red: "+r);
                    tvGreen.setText("Green: "+g);
                    tvBlue.setText("Blue: "+b);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please enter a valid HEX code!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private boolean convertHEXtoRGB(EditText etHex) {
        if(etHex.length() == 6)
        {
            //extract r, g, b from hex string:
            String red = etHex.getText().toString().substring(0,2);
            String green = etHex.getText().toString().substring(2,4);
            String blue = etHex.getText().toString().substring(4,6);

            try{
                //convert r, g, b string in Base 16.
                r = Integer.parseInt(red,16);
                g = Integer.parseInt(green,16);
                b = Integer.parseInt(blue,16);
                return true;

            }
            catch (final NumberFormatException e) {
                return false;
            }
        }
        if(etHex.length() == 2)
        {

            //extract r, g, b from hex string:
            String red = etHex.getText().toString().substring(0,2);
            String green = red; //etHex.getText().toString().substring(2,4);
            String blue = red; //etHex.getText().toString().substring(4,6);

            //update etHex:
            etHex.setText(red + green + blue);

            try{
                //convert r, g, b string in Base 16.
                r = Integer.parseInt(red,16);
                g = Integer.parseInt(green,16);
                b = Integer.parseInt(blue,16);
                return true;

            }
            catch (final NumberFormatException e) {
                return false;
            }
        }
        if(etHex.length() == 3)
        {

            //extract r, g, b from hex string:
            String red = etHex.getText().toString().substring(0,1);
            String green = etHex.getText().toString().substring(1,2);
            String blue = etHex.getText().toString().substring(2,3);

            //doubles
            red = red +red;
            green = green +green;
            blue = blue +blue;

            //update etHex:
            etHex.setText(red + green + blue);

            try{
                //convert r, g, b string in Base 16.
                r = Integer.parseInt(red,16);
                g = Integer.parseInt(green,16);
                b = Integer.parseInt(blue,16);
                return true;

            }
            catch (final NumberFormatException e) {
                return false;
            }
        }
        else{
            return false;
        }

    }
}