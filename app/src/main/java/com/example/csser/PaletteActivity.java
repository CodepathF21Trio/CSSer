package com.example.csser;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PaletteActivity extends AppCompatActivity {

    private RecyclerView rvColor;
    private ColorAdapter colorAdapter;
    private ArrayList<Color> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        rvColor = findViewById(R.id.rvColor);
        colors = new ArrayList<>();

        colors.add(new Color("Black", "#000000", "000"));
        colors.add(new Color("White", "#FFFFFF", "255, 255, 255"));
        colors.add(new Color("Red", "#FF0000", "255, 0, 0"));
        colors.add(new Color("Lime", "#00FF00", "0, 255, 0"));
        colors.add(new Color("Blue", "#0000FF", "0, 0, 255"));
        colors.add(new Color("Yellow", "#FFFF00", "255, 255, 0"));
        colors.add(new Color("Aqua", "#00FFFF", "0, 255, 255"));
        colors.add(new Color("Magenta ", "#FF00FF", "255, 0, 255"));
        colors.add(new Color("Silver", "#C0C0C0", "192, 192, 192"));
        colors.add(new Color("Grey", "#808080", "128, 128, 128"));
        colors.add(new Color("Maroon ", "#800000", "128, 0, 0"));
        colors.add(new Color("Olive", "#808000", "128, 128, 0"));
        colors.add(new Color("Green", "#008000", "0, 128, 0"));
        colors.add(new Color("Purple", "#800080", "128, 0, 128"));
        colors.add(new Color("Teal", "#008080", "0, 128, 128"));
        colors.add(new Color("Navy", "#000080", "0, 0, 128"));
        colors.add(new Color("Brown", "#A52A2A", "165, 42, 42"));
        colors.add(new Color("Orange", "#FFA500", "255, 165, 0"));
        colors.add(new Color("Midnight Blue", "#191970", "25, 25, 112"));


        colorAdapter = new ColorAdapter(PaletteActivity.this, colors);
        rvColor.setLayoutManager(new LinearLayoutManager(PaletteActivity.this));
        rvColor.setAdapter(colorAdapter);
    }
}