package com.example.happybirthday

fun main () {
    val myFirstDice = Dices(6, "azul")
    println("Meu dado de cor ${myFirstDice.color()} e ${myFirstDice.numSides} lados caiu em ${myFirstDice.roll()} !")

    val mySecondDice = Dices(20, "vermelho")
    println("Meu dado de cor ${mySecondDice.color()} e ${mySecondDice.numSides} lados caiu em ${mySecondDice.roll()} !")

    val myCoin = Coin()
    println("A minha moeda deu ${myCoin.roll()}")
}

class Dices (val numSides: Int, private val cor: String) {
    fun color(): String {
        return cor
    }

    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Coin {
    fun roll(): String {
        val randomNumber = (1..2).random()

        return if (randomNumber == 1) {
            "Cara"
        } else {
            "Coroa"
        }
    }
}