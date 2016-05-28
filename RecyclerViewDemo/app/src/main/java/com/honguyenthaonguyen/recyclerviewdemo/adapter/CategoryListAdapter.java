package com.honguyenthaonguyen.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.honguyenthaonguyen.recyclerviewdemo.R;

import java.util.List;

/**
 * Created by NGUYEN on 5/12/2016.
 */
public class CategoryListAdapter extends Adapter {
    List<String> mDataset;

    public CategoryListAdapter(List<String> mDataset){
        this.mDataset = mDataset;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textView;

        public ViewHolder(View itemView)
        {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_category_name);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_category_list,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textView.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
