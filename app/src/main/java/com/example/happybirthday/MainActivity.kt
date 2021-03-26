package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Seta o conteúdo da view utilizando o layout que eu escolher
        setContentView(R.layout.dice_roler)

        // Cria um ponto da memória para localizar a view pelo id único
        val rollButton: Button = findViewById(R.id.button)

        // Chama a fução rollDice quando o botão referenciado for clicado
        rollButton.setOnClickListener { rollDice() }
    }

    //    FUNÇÕES
//    Função de rodar o dado
    private fun rollDice() {
        // Cria um objeto dice e chama o método roll()
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Cria um ponto na memória para view e modifica o text atribuindo o valor do método roll.
        val resultTextView: TextView = findViewById(R.id.resultText)
        resultTextView.text = diceRoll.toString()
    }

    //    CLASSES
//   Criação da classe Dado
    class Dice(private val numSides: Int) {
        // Cira um método chamado roll, que retorna um valor aleatório em um arranjo
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}