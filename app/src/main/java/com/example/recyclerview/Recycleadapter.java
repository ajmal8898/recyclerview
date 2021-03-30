package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycleadapter extends RecyclerView.Adapter<Recycleadapter.Myview> {
    List<String> list;
    Context context;
    Display listener;

    public Recycleadapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        listener = (MainActivity) context;
    }

    @NonNull
    @Override
    public Myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout, parent, false);
        Myview myviewholder = new Myview(Item);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myview holder, int position) {
        String name = list.get(position);
        holder.tview.setText(name);
        holder.tview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.Dispalyitem(list.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class Myview extends RecyclerView.ViewHolder {
        TextView tview;

        public Myview(@NonNull View itemView) {
            super(itemView);
            tview = itemView.findViewById(R.id.txt);
        }
    }
}
