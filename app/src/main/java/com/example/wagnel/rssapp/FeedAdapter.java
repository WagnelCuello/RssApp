package com.example.wagnel.rssapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.prof.rssparser.Article;

import java.util.ArrayList;

public class FeedAdapter extends ArrayAdapter<Article> {
   /* RequestOptions options = new RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round);
*/
    public FeedAdapter(@NonNull Context context, ArrayList<Article> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
/*
        Article dataSource = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_data_rss, parent, false);
        }

        TextView titleTxt = view.findViewById(R.id.title_view);
        TextView descriptionTxt = view.findViewById(R.id.desc_view);
        ImageView articleImg = view.findViewById(R.id.image_view);

        titleTxt.setText(dataSource.getTitle());
        descriptionTxt.setText(dataSource.getDescription());
        String ver = dataSource.getImage();

        Glide.with(getContext()).load(dataSource.getImage()).apply(options).into(articleImg); */

        return view;
    }
}
