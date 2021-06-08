package com.example.dicegameassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView computerDice, userDice, result;
    Button higherButton, lowerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerDice = findViewById(R.id.computer_dice);
        userDice = findViewById(R.id.user_dice);
        result = findViewById(R.id.result);
        higherButton = findViewById(R.id.btn_higher);
        lowerButton = findViewById(R.id.btn_lower);

        int [] dieArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        higherButton.setOnClickListener(view -> {
            Random rand = new Random();
            int randComp = rand.nextInt(6);
            int randUser = rand.nextInt(6);

            computerDice.setImageResource(dieArray[randComp]);
            userDice.setImageResource(dieArray[randUser]);

            if (randUser > randComp) {
                result.setImageResource(R.drawable.userwin);
            } else if (randUser < randComp) {
                result.setImageResource(R.drawable.computerwin);
            } else {
                result.setImageResource(R.drawable.tie);
            }
        });

        lowerButton.setOnClickListener(view -> {
            Random rand = new Random();
            int randComp = rand.nextInt(6);
            int randUser = rand.nextInt(6);

            computerDice.setImageResource(dieArray[randComp]);
            userDice.setImageResource(dieArray[randUser]);

            if (randComp > randUser) {
                result.setImageResource(R.drawable.userwin);
            } else if (randComp < randUser) {
                result.setImageResource(R.drawable.computerwin);
            } else {
                result.setImageResource(R.drawable.tie);
            }
        });
    }


}