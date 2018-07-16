package com.ivan.skripsi.skripsi_ivan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView KameraCard, GaleriCard, MetodeCard, TentangCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //definisi ID dari CardView yang telah dibuat
        KameraCard = (CardView) findViewById(R.id.kamera);
        GaleriCard = (CardView) findViewById(R.id.galeri);
        MetodeCard = (CardView) findViewById(R.id.metode);
        TentangCard = (CardView) findViewById(R.id.tentang);

        //tambahkan ClickListener ke CardView
        KameraCard.setOnClickListener(this);
        GaleriCard.setOnClickListener(this);
        MetodeCard.setOnClickListener(this);
        TentangCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.kamera : i = new Intent(this,Activity_Kamera.class);startActivity(i);break;
            case R.id.galeri : i = new Intent(this,Activity_Galeri.class);startActivity(i);break;
            case R.id.metode : i = new Intent(this,Activity_Metode.class);startActivity(i);break;
            case R.id.tentang : i = new Intent(this,Activity_Tentang.class);startActivity(i);break;
            default:break;
        }
    }
}
