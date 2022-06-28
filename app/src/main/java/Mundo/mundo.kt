package Mundo

import com.gerappdev.diceapp.R

data class dados (
    val imgDicesPre: List<Int> = listOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6 )
){
    fun darDado(): Int {
        return imgDicesPre.random()
    }
}