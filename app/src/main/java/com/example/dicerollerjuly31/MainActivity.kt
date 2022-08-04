package com.example.dicerollerjuly31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    // function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.btn_roll)



        rollButton.setOnClickListener {

            rollDice()
        }

    }

    private fun rollDice() {
        val image : ImageView = findViewById(R.id.img_number)
        val dice = Dice(6)

       val imageRe = when(dice.roll()) {
            1 ->  R.drawable.dice_1
            2 ->  R.drawable.dice_2
            3 ->  R.drawable.dice_3
            4 ->  R.drawable.dice_4
            5 ->  R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        image.setImageResource(imageRe)

    }
}