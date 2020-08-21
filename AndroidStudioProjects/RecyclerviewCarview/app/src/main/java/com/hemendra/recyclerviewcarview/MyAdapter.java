package com.hemendra.recyclerviewcarview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ListData[] listData;
    public MyAdapter(ListData[] listdata)
    {
        this.listData = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ListData data = listData[position];
      //  holder.textView.setText(data.getTitle());
        holder.imageView.setImageResource(data.getImg());


    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CircularImageView imageView;
       // TextView textView;

        public ViewHolder(View itemview)
        {
            super(itemview);

            this.imageView = itemview.findViewById(R.id.rv_item_image);
          //  this.textView = itemview.findViewById(R.id.rv_item_text);
        }
    }
}
