package com.example.felicitacindenavidad;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.util.Objects.requireNonNull;

public class Felicitacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitacion);
        requireNonNull(getSupportActionBar()).hide();
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.jinglebellrock);
        mediaPlayer.start();
        TextView[] l=new TextView[12];
        l[0]=  findViewById(R.id.l1);
        l[1]=  findViewById(R.id.l2);
        l[2]=  findViewById(R.id.l3);
        l[3]=  findViewById(R.id.l4);
        l[4]=  findViewById(R.id.l5);
        l[5]=  findViewById(R.id.l6);
        l[6]=  findViewById(R.id.l7);
        l[7]=  findViewById(R.id.l8);
        l[8]=  findViewById(R.id.l9);
        l[9]=  findViewById(R.id.l10);
        l[10]=  findViewById(R.id.l11);
        l[11]=  findViewById(R.id.l12);
        ImageView[] arbol=new ImageView[3];
        arbol[0]=findViewById(R.id.arbol1);
        arbol[1]=findViewById(R.id.arbol2);
        arbol[2]=findViewById(R.id.arbol3);
        Animation animacion= AnimationUtils.loadAnimation(this,R.anim.aparecer1);
        for(int i=0;i<l.length;i++)
            l[i].startAnimation(animacion);
        for(int i=0;i<arbol.length;i++)
            arbol[i].startAnimation(animacion);

        ImageView[] reno=new ImageView[10];
        Animation baile=AnimationUtils.loadAnimation(this,R.anim.baile);
        reno[0]=findViewById(R.id.reno11);
        reno[1]=findViewById(R.id.reno12);
        reno[2]=findViewById(R.id.reno13);
        reno[3]=findViewById(R.id.reno14);
        reno[4]=findViewById(R.id.reno15);
        reno[5]=findViewById(R.id.reno21);
        reno[6]=findViewById(R.id.reno22);
        reno[7]=findViewById(R.id.reno23);
        reno[8]=findViewById(R.id.reno24);
        reno[9]=findViewById(R.id.reno25);
        for(int i=0;i<reno.length;i++)
            reno[i].startAnimation(baile);

        ImageView[] campana=new ImageView[12];
        Animation baile2=AnimationUtils.loadAnimation(this,R.anim.baile2);
        campana[0]=findViewById(R.id.campana11);
        campana[1]=findViewById(R.id.campana12);
        campana[2]=findViewById(R.id.campana13);
        campana[3]=findViewById(R.id.campana14);
        campana[4]=findViewById(R.id.campana15);
        campana[5]=findViewById(R.id.campana16);
        campana[6]=findViewById(R.id.campana21);
        campana[7]=findViewById(R.id.campana22);
        campana[8]=findViewById(R.id.campana23);
        campana[9]=findViewById(R.id.campana24);
        campana[10]=findViewById(R.id.campana25);
        campana[11]=findViewById(R.id.campana26);

        for(int i=0;i<campana.length;i++)
            campana[i].startAnimation(baile2);

        ImageView[] boy=new ImageView[6];
        ImageView[] girl=new ImageView[6];
        Animation baile3=AnimationUtils.loadAnimation(this,R.anim.baile3);
        Animation baile4=AnimationUtils.loadAnimation(this,R.anim.baile4);
        boy[0]=findViewById(R.id.boy11);
        boy[1]=findViewById(R.id.boy12);
        boy[2]=findViewById(R.id.boy13);
        boy[3]=findViewById(R.id.boy21);
        boy[4]=findViewById(R.id.boy22);
        boy[5]=findViewById(R.id.boy23);
        girl[0]=findViewById(R.id.girl11);
        girl[1]=findViewById(R.id.girl12);
        girl[2]=findViewById(R.id.girl13);
        girl[3]=findViewById(R.id.girl21);
        girl[4]=findViewById(R.id.girl22);
        girl[5]=findViewById(R.id.girl23);
        for (int i=0;i<girl.length;i++){
            boy[i].startAnimation(baile4);
            girl[i].startAnimation(baile3);

        }
    }
}
