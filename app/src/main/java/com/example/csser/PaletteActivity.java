package com.example.csser;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PaletteActivity extends AppCompatActivity {

    private RecyclerView rvColor;
    private ColorAdapter colorAdapter;
    private ArrayList<AColor> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //animate the background
        LinearLayout constraintLayout = findViewById(R.id.palette_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        rvColor = findViewById(R.id.rvColor);
        colors = new ArrayList<>();

        colors.add(new AColor("Black", "#000000", "0, 0, 0"));
        colors.add(new AColor("White", "#FFFFFF", "255, 255, 255"));
        colors.add(new AColor("Red", "#FF0000", "255, 0, 0"));
        colors.add(new AColor("Lime", "#00FF00", "0, 255, 0"));
        colors.add(new AColor("Blue", "#0000FF", "0, 0, 255"));
        colors.add(new AColor("Yellow", "#FFFF00", "255, 255, 0"));
        colors.add(new AColor("Aqua", "#00FFFF", "0, 255, 255"));
        colors.add(new AColor("Magenta ", "#FF00FF", "255, 0, 255"));
        colors.add(new AColor("Silver", "#C0C0C0", "192, 192, 192"));
        colors.add(new AColor("Grey", "#808080", "128, 128, 128"));
        colors.add(new AColor("Maroon ", "#800000", "128, 0, 0"));
        colors.add(new AColor("Olive", "#808000", "128, 128, 0"));
        colors.add(new AColor("Green", "#008000", "0, 128, 0"));
        colors.add(new AColor("Purple", "#800080", "128, 0, 128"));
        colors.add(new AColor("Teal", "#008080", "0, 128, 128"));
        colors.add(new AColor("Navy", "#000080", "0, 0, 128"));
        colors.add(new AColor("Brown", "#A52A2A", "165, 42, 42"));
        colors.add(new AColor("Orange", "#FFA500", "255, 165, 0"));
        colors.add(new AColor("Midnight Blue", "#191970", "25, 25, 112"));


        colorAdapter = new ColorAdapter(PaletteActivity.this, colors);
        rvColor.setLayoutManager(new LinearLayoutManager(PaletteActivity.this));
        rvColor.setAdapter(colorAdapter);
    }
}