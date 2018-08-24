package com.example.wagnel.rssapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String urlDiarioLibre = "https://www.diariolibre.com/rss/portada.xml";
    private Bundle bundle = null;
    private Intent intent = null;
    private Button btnListinDiario = null, btnWired = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();
    }

    private void start(){
        this.btnListinDiario = findViewById(R.id.diario_libre_btn);
        this.btnWired = findViewById(R.id.wired_btn);

        this.btnListinDiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRss();
            }
        });
    }

    private void showRss(){
        this.intent = new Intent(this, RssActivity.class);
        this.bundle = new Bundle();

        this.bundle.putString("FEED_URL",urlDiarioLibre);
        this.intent.putExtras(bundle);

        startActivity(intent);
    }
}
