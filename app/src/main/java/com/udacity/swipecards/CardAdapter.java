package com.udacity.swipecards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardHolder> {

    Context mContext;
    List<String> mList;

    public CardAdapter(Context context, List<String> list) {
        this.mList = list;
        this.mContext = context;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card, null);
        CardHolder rcv = new CardHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        final String current = mList.get(position);
        holder.cardName.setText(current);
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder {

        TextView cardName;

        public CardHolder(@NonNull View itemView) {
            super(itemView);
            cardName = itemView.findViewById(R.id.card_text);
        }
    }
}
