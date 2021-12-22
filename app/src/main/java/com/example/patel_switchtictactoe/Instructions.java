//Name: Vidhi Patel
//Date: May 21, 2021
//Purpose: Switch Mario Tic Tac Toe
package com.example.patel_switchtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class Instructions extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        
    }

    //goes to game screen
    public void play(View view) {
        Intent i = new Intent(this, Game.class);
        startActivity(i);
    }

    //goes to home screen
    public void Home(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
