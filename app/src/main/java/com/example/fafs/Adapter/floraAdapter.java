package com.example.fafs.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fafs.R;
import com.example.fafs.floradetailedActivity;
import com.example.fafs.florauser;

import java.util.ArrayList;

public class floraAdapter extends RecyclerView.Adapter<floraAdapter.ViewHolder> {

ArrayList<florauser> list;
Context context;
 florauser florauser=new florauser();

    public floraAdapter(ArrayList<florauser> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).img);
        holder.type.setText(list.get(position).type);
        holder.name.setText(list.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, floradetailedActivity.class);
                intent.putExtra("Name",florauser.getName());
                intent.putExtra("Type",florauser.getType());
                intent.putExtra("sciname",florauser.getSciName());
                intent.putExtra("plantfamily",florauser.getPlantFamily());
                intent.putExtra("nat",florauser.getNat());
                intent.putExtra("exposure",florauser.getExposure());
                intent.putExtra("season",florauser.getSeason());
                intent.putExtra("height",florauser.getHeight());
                intent.putExtra("water",florauser.getWaterNeeds());
                intent.putExtra("soiltype",florauser.getSoilTYpe());
                intent.putExtra("soilph",florauser.getSoilPh());
                intent.putExtra("soildrainage",florauser.getSoilDrainage());
                intent.putExtra("characteristics",florauser.getCharacteristics());
                intent.putExtra("img",florauser.getImg());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,type;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imgPlant);
            name=itemView.findViewById(R.id.textName);
            type=itemView.findViewById(R.id.textType);
        }
    }
}
