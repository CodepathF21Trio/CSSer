package com.example.csser;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder>{

    private Context context;
    private ArrayList<AColor> colors;

    public ColorAdapter(Context context, ArrayList<AColor> colors){
        this.context = context;
        this.colors = colors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View colorView = LayoutInflater.from(context).inflate(R.layout.activity_color_item, parent, false);
        return new ViewHolder(colorView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AColor color = colors.get(position);
        holder.bind(color);
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View colorBox;
        private TextView colorName;
        private TextView colorHex;
        private TextView colorRgb;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            colorBox = itemView.findViewById(R.id.colorBox);
            colorName = itemView.findViewById(R.id.colorName);
            colorHex = itemView.findViewById(R.id.colorHex);
            colorRgb = itemView.findViewById(R.id.colorRgb);
        }

        public void bind(AColor color){
            colorBox.setBackgroundColor(Color.parseColor(color.getHex()));
            colorName.setText(color.getName());
            colorHex.setText(color.getHex());
            colorRgb.setText(color.getRgb());
        }
    }
}
