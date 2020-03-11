package com.sportzshop.sportzshop.ViewHolder;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sportzshop.sportzshop.Interface.ItemClickListener;
import com.sportzshop.sportzshop.R;


public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListener listener;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=(ImageView) itemView.findViewById(R.id.product_image);
        txtProductName=(TextView) itemView.findViewById(R.id.product_name);
        txtProductDescription=(TextView) itemView.findViewById(R.id.product_description);
        txtProductPrice=(TextView) itemView.findViewById(R.id.product_price);
    }

    public void ItemClickListner(ItemClickListener listener){
         this.listener=listener;
    }

    @Override
    public void onClick(View view) {
         listener.onClick(view,getAdapterPosition(),false);
    }
}
