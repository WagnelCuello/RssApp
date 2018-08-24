package com.example.wagnel.rssapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.prof.rssparser.Article;

import java.util.ArrayList;

public class FeedAdapter extends ArrayAdapter<Article> {

    public FeedAdapter(@NonNull Context context, ArrayList<Article> objects) {
        super(context, 0, objects);
    }
}
