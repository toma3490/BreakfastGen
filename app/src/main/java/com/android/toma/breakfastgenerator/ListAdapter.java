package com.android.toma.breakfastgenerator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder> {

    private LayoutInflater layoutInflater;
    private ArrayList<Food> mFoods;
//    private OnClickMyAdapter onClickMyAdapter;

    public ListAdapter(Context context, ArrayList<Food> list) {
        layoutInflater = LayoutInflater.from(context);
        this.mFoods = list;
    }

//    public void updateList(ArrayList<Food> list){
//        this.mFoods = list;
//        notifyDataSetChanged();
//    }

//    public void updateListPosition(ArrayList<Food> list, int position){
//        this.mFoods = list;
//        notifyItemRemoved(position);
//    }

//    public void setOnClickListenerAdapter(OnClickMyAdapter onClickMyAdapter){
//        this.onClickMyAdapter = onClickMyAdapter;
//    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(layoutInflater.inflate(R.layout.card_item, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        holder.mDishTitle.setText(mFoods.get(position).getTitle());
        holder.mDishCookingTime.setText("Cooking time " + mFoods.get(position).getCookingTime() + " min");
//        holder.mDishIngredients.setText(mFoods.get(position).toString());
//        holder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickMyAdapter.onClick(position);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

//    interface OnClickMyAdapter{
//        void onClick(int position);
//    }

    static class Holder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mDishTitle;
        TextView mDishCookingTime;
        TextView mDishIngredients;
        View mView;

        Holder(View itemView) {
            super(itemView);
            mView = itemView;
            mImageView = (ImageView) itemView.findViewById(R.id.image);
            mDishTitle = (TextView) itemView.findViewById(R.id.dishTitle);
            mDishCookingTime = (TextView) itemView.findViewById(R.id.dishCookingTime);
            mDishIngredients = (TextView) itemView.findViewById(R.id.dishIngredients);
        }
    }
}
