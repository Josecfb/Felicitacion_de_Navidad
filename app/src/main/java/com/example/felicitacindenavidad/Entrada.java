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


        ImageView adorno1=findViewById(R.id.adorno1);
        ImageView adorno2=findViewById(R.id.adorno2);
        ImageView adorno3=findViewById(R.id.adorno3);
        ImageView adorno4=findViewById(R.id.adorno4);
        ImageView adorno5=findViewById(R.id.adorno5);
        ImageView adorno6=findViewById(R.id.adorno6);
        ImageView adorno7=findViewById(R.id.adorno7);
        ImageView adorno8=findViewById(R.id.adorno8);
        ImageView adorno9=findViewById(R.id.adorno9);
        ImageView adorno10=findViewById(R.id.adorno10);
        Animation caer1=AnimationUtils.loadAnimation(this,R.anim.caer1);
        Animation caer2=AnimationUtils.loadAnimation(this,R.anim.caer2);
        Animation caer3=AnimationUtils.loadAnimation(this,R.anim.caer3);
        Animation caer4=AnimationUtils.loadAnimation(this,R.anim.caer4);
        Animation caer5=AnimationUtils.loadAnimation(this,R.anim.caer5);
        adorno1.startAnimation(caer1);
        adorno10.startAnimation(caer1);
        adorno2.startAnimation(caer2);
        adorno9.startAnimation(caer2);
        adorno3.startAnimation(caer3);
        adorno8.startAnimation(caer3);
        adorno4.startAnimation(caer4);
        adorno7.startAnimation(caer4);
        adorno5.startAnimation(caer5);
        adorno6.startAnimation(caer5);

        animacion.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(Entrada.this, Felicitacion.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}