package com.android.toma.breakfastgenerator.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.toma.breakfastgenerator.R;
import com.android.toma.breakfastgenerator.animation.ResizeAnimation;
import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder> {

    private LayoutInflater layoutInflater;
    private ArrayList<Food> foodList;
//    private OnClickMyAdapter onClickMyAdapter;
    private boolean isShown = false;
    ResizeAnimation resizeAnimation;

    public ListAdapter(Context context, ArrayList<Food> list) {
        layoutInflater = LayoutInflater.from(context);
        this.foodList = list;
    }

//    public void updateList(ArrayList<Food> list){
//        this.foodList = list;
//        notifyDataSetChanged();
//    }

//    public void updateListPosition(ArrayList<Food> list, int position){
//        this.foodList = list;
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
    public void onBindViewHolder(final Holder holder, final int position) {
        holder.dishTitle.setText(foodList.get(position).getTitle());
        holder.dishCookingTime.setText("Cooking time " + foodList.get(position).getCookingTime() + " min");
        holder.imageView.setImageResource(foodList.get(position).getFoodImage());
        holder.ingredientsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isShown == false){
                    holder.ingredientsContent.setVisibility(View.VISIBLE);
                    holder.ingredientsContent.setText(foodList.get(position).getIngredients().toString());
                    isShown = true;
                }else if (isShown == true){
                    holder.ingredientsContent.setVisibility(View.GONE);
                    isShown = false;
                }
            }
        });
//        holder.view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickMyAdapter.onClick(position);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

//    interface OnClickMyAdapter{
//        void onClick(int position);
//    }

    static class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView dishTitle;
        TextView dishCookingTime;
        TextView ingredientsHeader;
        TextView ingredientsContent;
        View view;

        Holder(View itemView) {
            super(itemView);
            view = itemView;
            imageView = (ImageView) itemView.findViewById(R.id.image);
            dishTitle = (TextView) itemView.findViewById(R.id.dishTitle);
            dishCookingTime = (TextView) itemView.findViewById(R.id.dishCookingTime);
            ingredientsHeader = (TextView) itemView.findViewById(R.id.dishIngredients);
            ingredientsContent = (TextView) itemView.findViewById(R.id.ingrContent);
        }
    }
}
