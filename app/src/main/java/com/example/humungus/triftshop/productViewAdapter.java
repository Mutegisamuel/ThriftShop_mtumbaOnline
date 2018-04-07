package com.example.humungus.triftshop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class productViewAdapter extends RecyclerView.Adapter<productViewAdapter.ProductViewHolder> {

    private Context mContext;
    private List<productModel> mData;

    public productViewAdapter(Context mContext, List<productModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.products_lst,parent,false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

    holder.Thumbnail.setImageResource(mData.get(position).getThumbnail());
    holder.Name.setText(mData.get(position).getProductTitle());
    holder.Price.setText(mData.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  static class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView Thumbnail;
        TextView Name;
        TextView Price;


        public ProductViewHolder(View itemView) {
            super(itemView);

            Thumbnail =  itemView.findViewById(R.id.productimage);
            Name = itemView.findViewById(R.id.productname);
            Price =  itemView.findViewById(R.id.productprice);
        }
    }




}
