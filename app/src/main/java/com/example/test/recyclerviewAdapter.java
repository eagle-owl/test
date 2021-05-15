package com.example.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.CustomViewHolder> {

    private ArrayList<recyclerviewData> arrayList;

    public recyclerviewAdapter(ArrayList<recyclerviewData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public recyclerviewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false );
        CustomViewHolder holder = new CustomViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewAdapter.CustomViewHolder holder, int position) {
        holder.img_path.setImageResource(arrayList.get(position).getImg_path());
        holder.pro_name.setText(arrayList.get(position).getPro_name());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curName = holder.pro_name.getText().toString();
                Toast.makeText(v.getContext(),curName, Toast.LENGTH_SHORT).show();


            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                return true;
            }
        });


    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView img_path;
        protected TextView pro_name;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img_path = (ImageView) itemView.findViewById(R.id.img_path);
            this.pro_name = (TextView) itemView.findViewById(R.id.pro_name);
        }
    }
}


