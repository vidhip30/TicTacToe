//Name: Vidhi Patel
//Date: May 21, 2021
//Purpose: Switch Mario Tic Tac Toe
package com.example.patel_switchtictactoe;


import android.view.View;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //goes to game screen
    public void play(View view) {
        Intent i = new Intent(this, Game.class);
        startActivity(i);
    }

    //goes to instructions screen
    public void ins(View view) {
        Intent i = new Intent(this, Instructions.class);
        startActivity(i);
    }
}
