package com.example.wagnel.rssapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.prof.rssparser.Article;
import com.prof.rssparser.Parser;

import java.util.ArrayList;

public class RssActivity extends AppCompatActivity implements Parser.OnTaskCompleted, AdapterView.OnItemClickListener {
    private ListView feedListView = null;
    private ArrayList<Article> listArticle;
    private String FEED_URL = "FEED_URL", url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rss);
        //getRss();
    }

    private void getRss(){
        feedListView = findViewById(R.id.feed_list_view);
        url = getIntent().getExtras().getString(FEED_URL);
        Parser parser = new Parser();
        parser.onFinish(this);
        parser.execute(url);
    }

    @Override
    public void onTaskCompleted(ArrayList<Article> list) {
        feedListView.setAdapter(new FeedAdapter(this, list));
        listArticle = list;
    }

    @Override
    public void onError() {
        Toast.makeText(this, "ha ocurrido un error al mostrar las noticias, reintentando...", Toast.LENGTH_SHORT).show();
        getRss();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String link = listArticle.get(i).getLink();
        if (i % 2 == 0){
            Intent intent = new Intent(this, WebView.class);
            intent.putExtra("URL", link);
            startActivity(intent);
        } else {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(link));
            startActivity(intent);
        }
    }
}
