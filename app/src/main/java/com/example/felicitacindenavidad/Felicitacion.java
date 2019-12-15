package com.example.felicitacindenavidad;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Felicitacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitacion);


        TextView feliz=  findViewById(R.id.feliz);
        TextView navidad=findViewById(R.id.navidad);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.jinglebellrock);
        mediaPlayer.start();

        Animation animacion= AnimationUtils.loadAnimation(this,R.anim.aparecer);

        feliz.startAnimation(animacion);
        navidad.startAnimation(animacion);

        Animation baile=AnimationUtils.loadAnimation(this,R.anim.baile);
        ImageView reno1=findViewById(R.id.reno1);
        ImageView reno2=findViewById(R.id.reno2);
        ImageView reno3=findViewById(R.id.reno3);
        ImageView reno4=findViewById(R.id.reno4);
        ImageView reno5=findViewById(R.id.reno5);
        ImageView reno6=findViewById(R.id.reno6);

        reno1.startAnimation(baile);
        reno2.startAnimation(baile);
        reno3.startAnimation(baile);
        reno4.startAnimation(baile);
        reno5.startAnimation(baile);
        reno6.startAnimation(baile);

        Animation baile2=AnimationUtils.loadAnimation(this,R.anim.baile2);
        ImageView campana1=findViewById(R.id.campana1);
        ImageView campana2=findViewById(R.id.campana2);
        ImageView campana3=findViewById(R.id.campana3);
        ImageView campana4=findViewById(R.id.campana4);
        ImageView campana5=findViewById(R.id.campana5);

        campana1.startAnimation(baile2);
        campana2.startAnimation(baile2);
        campana3.startAnimation(baile2);
        campana4.startAnimation(baile2);
        campana5.startAnimation(baile2);

        Animation baile3=AnimationUtils.loadAnimation(this,R.anim.baile3);
        ImageView boy1=findViewById(R.id.boy1);
        ImageView boy2=findViewById(R.id.boy2);
        ImageView boy3=findViewById(R.id.boy3);

        boy1.startAnimation(baile3);
        boy2.startAnimation(baile3);
        boy3.startAnimation(baile3);

        Animation baile4=AnimationUtils.loadAnimation(this,R.anim.baile4);
        ImageView girl1=findViewById(R.id.girl1);
        ImageView girl2=findViewById(R.id.girl2);
        ImageView girl3=findViewById(R.id.girl3);

        girl1.startAnimation(baile4);
        girl2.startAnimation(baile4);
        girl3.startAnimation(baile4);
    }
}
