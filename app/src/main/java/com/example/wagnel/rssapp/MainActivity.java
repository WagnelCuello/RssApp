package com.example.wagnel.rssapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private String urlDiarioLibre = "https://www.diariolibre.com/rss/portada.xml", urlWired = "https://www.wired.com/feed/rss";
    //private Intent intent;
    //private Button btnListinDiario, btnWired;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start();
    }
/*
    private void start(){
        this.btnListinDiario = findViewById(R.id.diario_libre_btn);
        this.btnWired = findViewById(R.id.wired_btn);
        this.intent = new Intent(this, RssActivity.class);

        this.btnListinDiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDiarioLibre();
            }
        });

        this.btnWired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showWired();
            }
        });
    }

    private void showDiarioLibre(){
        intent.putExtra("FEED_URL",urlDiarioLibre);
        startActivity(intent);
    }

    private void showWired(){
        intent.putExtra("FEED_URL",urlWired);
        startActivity(intent);
    } */
}
