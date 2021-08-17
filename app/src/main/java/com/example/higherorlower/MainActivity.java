package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.Random;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void guessNumber(View view){

        EditText editText = (EditText) findViewById(R.id.numberGuess);


        int guessValue = Integer.parseInt(editText.getText().toString());


        String message;

        if( guessValue > randomNumber) {
            message = "Lower!";
        }
        else if ( guessValue < randomNumber){
            message = "Higher!";
        }
        else {
            message = "Correct! Now try again!";
            generateRandomNumber();

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}