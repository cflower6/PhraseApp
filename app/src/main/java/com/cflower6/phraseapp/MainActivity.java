package com.cflower6.phraseapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void btnPressed(View view){
        Button btn = (Button) view;

        if(btn == findViewById(R.id.btn8)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bonjour);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn7)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bonsoir);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn6)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bonnenuit);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn5)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.salut);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn4)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.aurevoir);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn3)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.silvousplait);
            mediaPlayer.start();
        }else if(btn == findViewById(R.id.btn2)){
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.mercibcp);
            mediaPlayer.start();
        }else{
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.commentvousappelezvous);
            mediaPlayer.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
