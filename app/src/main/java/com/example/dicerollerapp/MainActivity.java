package com.example.dicerollerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private TextView textView;
    private Random myrandom = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      imageButton = findViewById(R.id.imageButton);
       textView = findViewById(R.id.textView);

       imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRanNumber = myrandom.nextInt(6)+1;

                switch (myRanNumber){
                    case 1:
                       imageButton.setImageResource(R.drawable.dice1);
                      textView.setText("One");
                        break;
                    case 2:
                       imageButton.setImageResource(R.drawable.dice2);
                        textView.setText("Two");
                        break;
                    case 3:
                      imageButton.setImageResource(R.drawable.dice3);
                        textView.setText("Three");
                        break;
                    case 4:
                       imageButton.setImageResource(R.drawable.dice4);
                       textView.setText("Four");
                        break;
                    case 5:
                        imageButton.setImageResource(R.drawable.dice5);
                       textView.setText("Five");
                        break;
                    case 6:
                       imageButton.setImageResource(R.drawable.dice6);
                        textView.setText("Six");
                        break;
                }
            }
        });
    }
}