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
import com.example.sampleone.models.snacks.Snack;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.CustomViewHolder>{

    private static final String TAG = "CustomRecyclerAdapter";

    private List<Snack> snacksList;
//    private List<String> itemName = new ArrayList<>();
//    private List<Integer> priceSnacks = new ArrayList<>();

    private Context mContext;

    public CustomRecyclerAdapter(List<Snack> snacksList, Context mContext) {
        this.snacksList = snacksList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder called: ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foods_list, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        Log.d(TAG, "onBindViewHolder: Called");

        holder.mItemName.setText(snacksList.get(position).getName());

        holder.mActualPrice.setText(String.valueOf(snacksList.get(position).getPrice()));

        Picasso.get().load(snacksList.get(position).getImageUrl()).into(holder.mItemImage);

    }

    @Override
    public int getItemCount() {

        Log.d(TAG, "getItemCount: "+snacksList.size());

        return snacksList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_image_snack)
        ImageView mItemImage;
        @BindView(R.id.item_name_snack)
        TextView mItemName;
        @BindView(R.id.actual_price_ksh)
        TextView mActualPrice;
        @BindView(R.id.button_order)
        Button mOrderButton;

        private Context mContext;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            mContext = itemView.getContext();
        }
    }


}
