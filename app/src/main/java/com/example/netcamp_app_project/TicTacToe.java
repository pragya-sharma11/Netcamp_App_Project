package com.example.netcamp_app_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TicTacToe extends AppCompatActivity {
    ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button reset, back;
    private String startGame = "X";
    private int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, xCount = 0, oCount = 0, i = 0;
    private TextView scoreX, scoreO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        button1 = findViewById(R.id.btnImage1);
        button2 = findViewById(R.id.btnImage2);
        button3 = findViewById(R.id.btnImage3);
        button4 = findViewById(R.id.btnImage4);
        button5 = findViewById(R.id.btnImage5);
        button6 = findViewById(R.id.btnImage6);
        button7 = findViewById(R.id.btnImage7);
        button8 = findViewById(R.id.btnImage8);
        button9 = findViewById(R.id.btnImage9);
        scoreX = findViewById(R.id.scoreX);
        scoreO = findViewById(R.id.score0);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.tictacBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TicTacToe.this, PhoneScreen.class);
                startActivity(i);
                finish();
            }
        });
        onClickReset();
        onClickButton1();
        onClickButton2();
        onClickButton3();
        onClickButton4();
        onClickButton5();
        onClickButton6();
        onClickButton7();
        onClickButton8();
        onClickButton9();
    }
    private void onClickReset() {
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetValue();
                xCount = 0;
                oCount = 0;
                scoreX.setText("Score X : 0 ");
                scoreO.setText("Score 0 : 0 ");
            }
        });
    }

    private void resetValue() {
        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;
    }

    private void onClickButton1() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                } else {
                    button1.setImageResource(R.drawable.circle);
                    b1 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton2() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                } else {
                    button2.setImageResource(R.drawable.circle);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton3() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                } else {
                    button3.setImageResource(R.drawable.circle);
                    b3 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton4() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button4.setImageResource(R.drawable.cross);
                    b4 = 1;
                    i++;
                } else {
                    button4.setImageResource(R.drawable.circle);
                    b4 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton5() {
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button5.setImageResource(R.drawable.cross);
                    b5 = 1;
                    i++;
                } else {
                    button5.setImageResource(R.drawable.circle);
                    b5 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton6() {
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                } else {
                    button6.setImageResource(R.drawable.circle);
                    b6 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton7() {
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button7.setImageResource(R.drawable.cross);
                    b7 = 1;
                    i++;
                } else {
                    button7.setImageResource(R.drawable.circle);
                    b7 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton8() {
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button8.setImageResource(R.drawable.cross);
                    b8 = 1;
                    i++;
                } else {
                    button8.setImageResource(R.drawable.circle);
                    b8 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void onClickButton9() {
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")) {
                    button9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                } else {
                    button9.setImageResource(R.drawable.circle);
                    b9 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void choosePlayer() {
        if (startGame.equals("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winningGame() {
        //we have 16 cases of winning 8 for cross and 8 for zero.
        if (((b1 == 1) && (b2 == 1) && (b3 == 1)) || ((b1 == 1) && (b4 == 1) && (b7 == 1)) || ((b2 == 1) && (b5 == 1) && (b8 == 1)) || ((b4 == 1) && (b5 == 1) && (b6 == 1)) ||
                ((b3 == 1) && (b6 == 1) && (b9 == 1)) || ((b7 == 1) && (b8 == 1) && (b9 == 1))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValue();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X : " + xCount);

        } else if (((b1 == 0) && (b2 == 0) && (b3 == 0)) || ((b1 == 0) && (b4 == 0) && (b7 == 0)) || ((b2 == 0) && (b5 == 0) && (b8 == 0)) || ((b4 == 0) && (b5 == 0) && (b6 == 0)) ||
                ((b3 == 0) && (b6 == 0) && (b9 == 0)) || ((b7 == 0) && (b8 == 0) && (b9 == 0))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValue();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score 0 : " + oCount);
        } else if (b1 != 5 && b2 != 5 && b3 != 5 && b4 != 5 && b5 != 5 && b6 != 5 &&
                b7 != 5 && b8 != 5 && b9 != 5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you both noob.Try to win again!!").setCancelable(false).setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValue();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }
}