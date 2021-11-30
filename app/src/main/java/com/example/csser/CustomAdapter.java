package com.example.csser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Swatch> swatchArrayList;

    public CustomAdapter(Context context, ArrayList<Swatch> swatchArrayList) {
        this.context = context;
        this.swatchArrayList = swatchArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.innerlayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText("#"+ Integer.toHexString(swatchArrayList.get(position).getRgb()));
        holder.linearLayout.setBackgroundColor(swatchArrayList.get(position).getBodyTextColor());
    }

    @Override
    public int getItemCount() {
        return swatchArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView textView;
        private LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textval);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearval);
        }
    }
}
