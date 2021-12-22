//Name: Vidhi Patel
//Date: May 21, 2021
//Purpose: Switch Mario Tic Tac Toe
package com.example.patel_switchtictactoe;

import android.content.Intent;
import android.widget.ImageView;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    //holds the character on each square of the board
    int board[][] = new int[3][3];
    //tracks which player's turn it is
    int turn = 1;

    //changes the turn pictures and the board pictures when the player takes their turn
    public void flip(ImageView i) {
        ImageView turnpic = (ImageView) findViewById(R.id.turn);
        if (turn == 1) {
            i.setImageResource(R.drawable.mariopic);
            turn = 2;
            turnpic.setImageResource(R.drawable.luigiturn);
        } else {
            i.setImageResource(R.drawable.luigipic);
            turn = 1;
            turnpic.setImageResource(R.drawable.marioturn);
        }
    }

    //determines the winner if there is one and goes to the win screen
    public void win() {
        int winner = 0;
        //finds all possible ways of getting 3 in a row
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != 0)
            winner = board[1][0];

        else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != 0)
            winner = board[2][0];

        else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != 0)
            winner = board[0][0];

        else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != 0)
            winner = board[0][1];

        else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != 0)
            winner = board[0][2];

        else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0)
            winner = board[0][0];

        else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0)
            winner = board[0][2];

            //cat's game
        else if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 &&
                board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 &&
                board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0)
            winner = 3;
        //displays the winner
        if (winner == 1) {
            Toast.makeText(getApplicationContext(), "Mario Wins", Toast.LENGTH_SHORT).show();
        } else if (winner == 2) {
            Toast.makeText(getApplicationContext(), "Luigi Wins", Toast.LENGTH_SHORT).show();
        } else if (winner == 3) {
            Toast.makeText(getApplicationContext(), "Cat's game", Toast.LENGTH_SHORT).show();
        }
    }

    //lets the user change the first box to their character
    public void aClick(View view) {
        //blank spot
        if (board[0][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.a);
            board[0][0] = turn;
            flip(i);
            //if the player is clicking on their own piece
        } else if (((board[0][0] == 1) && (turn == 1)) || ((board[0][0] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.a);
            board[0][0] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the second box to their character
    public void bClick(View view) {
        if (board[0][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.b);
            board[0][1] = turn;
            flip(i);
        } else if (((board[0][1] == 1) && (turn == 1)) || ((board[0][1] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.b);
            board[0][1] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the third box to their character
    public void cClick(View view) {
        if (board[0][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.c);
            board[0][2] = turn;
            flip(i);
        } else if (((board[0][2] == 1) && (turn == 1)) || ((board[0][2] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.c);
            board[0][2] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the fourth box to their character
    public void dClick(View view) {
        if (board[1][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.d);
            board[1][0] = turn;
            flip(i);
        } else if (((board[1][0] == 1) && (turn == 1)) || ((board[1][0] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.d);
            board[1][0] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the fifth box to their character
    public void eClick(View view) {
        if (board[1][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.e);
            board[1][1] = turn;
            flip(i);
        } else if (((board[1][1] == 1) && (turn == 1)) || ((board[1][1] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.e);
            board[1][1] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the sixth box to their character
    public void fClick(View view) {
        if (board[1][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.f);
            board[1][2] = turn;
            flip(i);
        } else if (((board[1][2] == 1) && (turn == 1)) || ((board[1][2] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.f);
            board[1][2] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the seventh box to their character
    public void gClick(View view) {
        if (board[2][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.g);
            board[2][0] = turn;
            flip(i);
        } else if (((board[2][0] == 1) && (turn == 1)) || ((board[2][0] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.g);
            board[2][0] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the eighth box to their character
    public void hClick(View view) {
        if (board[2][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.h);
            board[2][1] = turn;
            flip(i);
        } else if (((board[2][1] == 1) && (turn == 1)) || ((board[2][1] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.h);
            board[2][1] = turn;
            flip(i);
        }
        win();
    }

    //lets the user change the last box to their character
    public void iClick(View view) {
        if (board[2][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.i);
            board[2][2] = turn;
            flip(i);
        } else if (((board[2][2] == 1) && (turn == 1)) || ((board[2][2] == 2) && (turn == 2))) {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        } else {
            ImageView i = (ImageView) findViewById(R.id.i);
            board[2][2] = turn;
            flip(i);
        }
        win();
    }

    //sets the boxes back to blanks
    public void reset(View view) {
        ImageView a = (ImageView) findViewById(R.id.a);
        a.setImageResource(R.drawable.blankbox);
        ImageView b = (ImageView) findViewById(R.id.b);
        b.setImageResource(R.drawable.blankbox);
        ImageView c = (ImageView) findViewById(R.id.c);
        c.setImageResource(R.drawable.blankbox);
        ImageView d = (ImageView) findViewById(R.id.d);
        d.setImageResource(R.drawable.blankbox);
        ImageView e = (ImageView) findViewById(R.id.e);
        e.setImageResource(R.drawable.blankbox);
        ImageView f = (ImageView) findViewById(R.id.f);
        f.setImageResource(R.drawable.blankbox);
        ImageView g = (ImageView) findViewById(R.id.g);
        g.setImageResource(R.drawable.blankbox);
        ImageView h = (ImageView) findViewById(R.id.h);
        h.setImageResource(R.drawable.blankbox);
        ImageView i = (ImageView) findViewById(R.id.i);
        i.setImageResource(R.drawable.blankbox);
        //resets the values of the board spaces
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                board[k][j] = 0;
            }
        }
    }

    //takes player to home page
    public void home(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    //takes player to instructions page
    public void ins(View view) {
        Intent i = new Intent(this, Instructions.class);
        startActivity(i);
    }
}
