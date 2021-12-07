package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ColorPickerActivity extends AppCompatActivity{
    private ImageView colorPickerImg;
    private TextView hexValue;
    private TextView rgbValue;
    private View colorBox;

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        //animate the background
        LinearLayout constraintLayout = findViewById(R.id.color_picker_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        colorPickerImg = findViewById(R.id.colorPickerImg);
        hexValue = findViewById(R.id.hexValue);
        rgbValue = findViewById(R.id.rgbValue);
        colorBox = findViewById(R.id.colorBox);

        colorPickerImg.setDrawingCacheEnabled(true);
        colorPickerImg.buildDrawingCache(true);

        colorPickerImg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                if(event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE){
                    bitmap = colorPickerImg.getDrawingCache();
                    int pixel = bitmap.getPixel((int)event.getX(), (int)event.getY());

                    int r = Color.red(pixel);
                    int g = Color.green(pixel);
                    int b = Color.blue(pixel);

                    String hex = "#" + Integer.toHexString(pixel).substring(2);
                    colorBox.setBackgroundColor(Color.rgb(r,g,b));

                    rgbValue.setText("HEX: " + hex);
                    hexValue.setText("RGB: " + r + ", " + g + ", " + b);
                }
                return true;
            }
        });
    }
}
