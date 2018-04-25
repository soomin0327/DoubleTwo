package com.example.dsm2016.doubletwo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dsm2016.doubletwo.Model.TMainNearServiceItem;
import com.example.dsm2016.doubletwo.R;

import java.util.ArrayList;
import java.util.List;

public class TMainNearServiceRecyclerViewAdapter extends RecyclerView.Adapter<TMainNearServiceRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<TMainNearServiceItem> itmes = new ArrayList();
    private static final int ITEM_COUNT = 3;

    public TMainNearServiceRecyclerViewAdapter(){}

    public TMainNearServiceRecyclerViewAdapter (Context context, ArrayList<TMainNearServiceItem> itmes) {
        this.context = context;
        this.itmes = itmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_traveler_main_recyclerview, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(itmes.get(position).getTitle());
        holder.location.setText(itmes.get(position).getLocation());
        holder.intro.setText(itmes.get(position).getIntro());
        holder.endDate.setText(itmes.get(position).getEndDate());
        holder.startDate.setText(itmes.get(position).getStartDate());
        holder.name.setText(itmes.get(position).getName());
        holder.personNum.setText(itmes.get(position).getPersonNum());
        holder.likes.setText(itmes.get(position).getLikes());
        Glide.with(context).load(itmes.get(position).getPicture()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return ITEM_COUNT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView title, likes, intro, name, personNum, startDate, endDate, location;
        public final ImageView imageView;
        public ViewHolder(View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.tMainNearServiceTitle);
            likes = (TextView) view.findViewById(R.id.tMainNearServiceLikes);
            intro = (TextView) view.findViewById(R.id.tMainNearServiceIntro);
            personNum = (TextView) view.findViewById(R.id.tMainNearServicePeopleNum);
            startDate = (TextView) view.findViewById(R.id.tMainNEarServiceStartDate);
            endDate = (TextView) view.findViewById(R.id.tMainNEarServiceEndDate);
            location = (TextView) view.findViewById(R.id.tMainNEarServiceLocation);
            name = (TextView) view.findViewById(R.id.tMainServiceGuideName);
            imageView = (ImageView)view.findViewById(R.id.tMainNearServicePic);
        }
    }
}
