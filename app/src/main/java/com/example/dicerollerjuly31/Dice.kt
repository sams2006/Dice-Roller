package com.example.dicerollerjuly31

class Dice(private val numSide:Int) {

    fun roll(): Int {
        return (1..numSide).random()
    }

}