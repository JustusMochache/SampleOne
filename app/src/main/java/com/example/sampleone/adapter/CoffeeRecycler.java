package com.example.sampleone.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleone.R;
import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.snacks.Snack;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoffeeRecycler extends RecyclerView.Adapter<CoffeeRecycler.CoffeeViewHolder> {

    private static final String TAG = "CustomRecyclerAdapter";

    private List<Coffee> coffeeList;
//    private List<String> itemName = new ArrayList<>();
//    private List<Integer> priceSnacks = new ArrayList<>();

    private Context mContext;

    public CoffeeRecycler(List<Coffee> coffeeList, Context mContext) {
        this.coffeeList = coffeeList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CoffeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coffee_list, parent, false);
        CoffeeViewHolder viewHolder = new CoffeeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeViewHolder holder, int position) {
        Picasso.get().load(coffeeList.get(position).getImageUrl()).into(holder.mItemImage);
        holder.mItemName.setText(coffeeList.get(position).getName());
        holder.mInHousePrice.setText(String.valueOf(coffeeList.get(position).getPriceInHouse()));
        holder.mPriceTakeAway.setText(String.valueOf(coffeeList.get(position).getPriceTakeAway()));
        holder.mPriceExtraShot.setText(String.valueOf(coffeeList.get(position).getPriceExtraShot()));

    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }


    public class CoffeeViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.food_display)
        ImageView mItemImage;
        @BindView(R.id.food_item)
        TextView mItemName;
        @BindView(R.id.inhousePrice)
        TextView mInHousePrice;
        @BindView(R.id.priceTakeAway)
        TextView mPriceTakeAway;
        @BindView(R.id.price_extra_shot)
        TextView mPriceExtraShot;
        @BindView(R.id.order_coffee)
        Button mOrderButton;

        private Context mContext;

        public CoffeeViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            mContext = itemView.getContext();
        }
    }





}
