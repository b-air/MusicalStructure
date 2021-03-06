package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.id.albumplaying;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView album = (TextView) findViewById(R.id.albumplaying);
        album.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(playIntent);
            }
        });

        TextView browse = (TextView) findViewById(R.id.recherche);
        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(playIntent);
            }
        });

        TextView mix = (TextView) findViewById(R.id.mixage);
        mix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this, MixActivity.class);
                startActivity(playIntent);
            }
        });

        TextView share = (TextView) findViewById(R.id.partage);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(playIntent);
            }
        });

        TextView buy = (TextView) findViewById(R.id.achat);
        buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(playIntent);
            }
        });
    }
}
