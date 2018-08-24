package com.example.wagnel.rssapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.prof.rssparser.Article;
import com.prof.rssparser.Parser;

import java.util.ArrayList;

public class RssActivity extends AppCompatActivity implements Parser.OnTaskCompleted {
    public ListView feedListView = null;
    private String FEED_URL = "FEED_URL", url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rss);
        getRss();
    }

    private void getRss(){
        feedListView = findViewById(R.id.feed_list_view);
        url = getIntent().getExtras().getString(FEED_URL);
        Parser parser = new Parser();
        parser.onFinish(this);
    }

    @Override
    public void onTaskCompleted(ArrayList<Article> list) {
        feedListView.setAdapter(new FeedAdapter(this, list));
    }

    @Override
    public void onError() {
        Toast.makeText(this, "ha ocurrido un error al mostrar las noticias, reintentando...", Toast.LENGTH_SHORT).show();
        getRss();
    }
}
