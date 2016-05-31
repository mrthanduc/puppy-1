package com.honguyenthaonguyen.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.honguyenthaonguyen.recyclerviewdemo.R;
import com.honguyenthaonguyen.recyclerviewdemo.productcategorymodel.ProductCategory;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by NGUYEN on 5/12/2016.
 */
public class CategoryListAdapter extends Adapter {
    List<ProductCategory> mDataset;

    public CategoryListAdapter(List<ProductCategory> mDataset){
        this.mDataset = mDataset;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textViewCategoryName, textViewProductCategoryQuantity, textViewProductCategoryDescription;


        public ViewHolder(View itemView)
        {
            super(itemView);
            textViewCategoryName = (TextView) itemView.findViewById(R.id.text_category_name);
            textViewProductCategoryQuantity = (TextView) itemView.findViewById(R.id.textViewProductCategoryQuantity);
            textViewProductCategoryDescription = (TextView) itemView.findViewById(R.id.textViewProductCategoryDescription);
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
        ((ViewHolder)holder).textViewCategoryName.setText(mDataset.get(position).getName());
        ((ViewHolder)holder).textViewProductCategoryQuantity.setText(mDataset.get(position).getCount() + "");
        ((ViewHolder)holder).textViewProductCategoryDescription.setText(mDataset.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
