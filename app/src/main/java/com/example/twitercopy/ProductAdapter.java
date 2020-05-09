package com.example.twitercopy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    ArrayList<ProductList> mArrayList;

    public ProductAdapter(ArrayList<ProductList> arrayList) {
        mArrayList = arrayList;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{

        public ImageView productImage;
        public TextView productTitle;
        public TextView productManu;
        public TextView productPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImg);
            productTitle = itemView.findViewById(R.id.productTitle);
            productManu = itemView.findViewById(R.id.productManufacture);
            productPrice = itemView.findViewById(R.id.productPrice);
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card,parent,false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);
        return productViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductList list = mArrayList.get(position);
        holder.productImage.setImageResource(list.getmProductImage());
        holder.productTitle.setText(list.getmProductTitle());
        holder.productManu.setText(list.getmProductManufacture());
        holder.productPrice.setText(list.getmProductPrice());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
