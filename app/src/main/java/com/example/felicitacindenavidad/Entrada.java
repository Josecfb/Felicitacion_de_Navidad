package com.example.felicitacindenavidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

import static java.util.Objects.*;

public class Entrada extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_entrada);
        requireNonNull(getSupportActionBar()).hide();
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.risa);
        mediaPlayer.start();
        TextView texto_entrada=findViewById(R.id.texto_entrada);
        Animation animacion= AnimationUtils.loadAnimation(this,R.anim.texto_entrada);
        texto_entrada.startAnimation(animacion);
        ImageView papa=findViewById(R.id.papa);
        Animation escalar=AnimationUtils.loadAnimation(this,R.anim.escalar);
        papa.startAnimation(escalar);
        ImageView[] adorno=new ImageView[10];
        adorno[0]=findViewById(R.id.adorno1);
        adorno[1]=findViewById(R.id.adorno2);
        adorno[2]=findViewById(R.id.adorno3);
        adorno[3]=findViewById(R.id.adorno4);
        adorno[4]=findViewById(R.id.adorno5);
        adorno[5]=findViewById(R.id.adorno6);
        adorno[6]=findViewById(R.id.adorno7);
        adorno[7]=findViewById(R.id.adorno8);
        adorno[8]=findViewById(R.id.adorno9);
        adorno[9]=findViewById(R.id.adorno10);
        Animation caer1=AnimationUtils.loadAnimation(this,R.anim.caer1);
        Animation caer2=AnimationUtils.loadAnimation(this,R.anim.caer2);
        Animation caer3=AnimationUtils.loadAnimation(this,R.anim.caer3);
        Animation caer4=AnimationUtils.loadAnimation(this,R.anim.caer4);
        Animation caer5=AnimationUtils.loadAnimation(this,R.anim.caer5);
        adorno[0].startAnimation(caer1);
        adorno[9].startAnimation(caer1);
        adorno[1].startAnimation(caer2);
        adorno[8].startAnimation(caer2);
        adorno[2].startAnimation(caer3);
        adorno[7].startAnimation(caer3);
        adorno[3].startAnimation(caer4);
        adorno[6].startAnimation(caer4);
        adorno[4].startAnimation(caer5);
        adorno[5].startAnimation(caer5);

        animacion.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent;
        intent = new Intent(this, Felicitacion.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}