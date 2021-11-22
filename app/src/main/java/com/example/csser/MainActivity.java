package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button converterButton;
    private Button paletteButton;
    private Button cameraButton;
    private Button downloadButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //animate the background
        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        // connect variable to the proper item in the layout
        converterButton = findViewById(R.id.converter_btn);
        paletteButton = findViewById(R.id.palette_btn);
        cameraButton = findViewById(R.id.camera_btn);
        downloadButton = findViewById(R.id.download_btn);

// Go to converter activity
        converterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConverterActivity();
            }
        });
        paletteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaletteActivity();
            }
        });
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCameraActivity();
            }
        });
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDownloadActivity();
            }
        });

    }


    public void openConverterActivity(){
        Intent i = new Intent(MainActivity.this, ConverterActivity.class );
        startActivity(i);

    }
    public void openPaletteActivity(){
        Intent i = new Intent(MainActivity.this, PaletteActivity.class );
        startActivity(i);

    }
    public void openCameraActivity(){
        Intent i = new Intent(MainActivity.this, CameraActivity.class );
        startActivity(i);

    }
    public void openDownloadActivity(){
        Intent i = new Intent(MainActivity.this, DownloadActivity.class );
        startActivity(i);

    }




}