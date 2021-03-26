package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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
        // Cria um objeto dado de 6 lados e chama o método roll()
        val dice6 = Dice(6)
        val dice6Roll = dice6.roll()

        // Cria um objeto dado de 20 lados e chama o método roll()
        val dice20 = Dice(20)
        val dice20Roll = dice20.roll()

        // Cria um ponto na memória para view e modifica o text atribuindo o valor do método roll.
        val resultTextDado6: TextView = findViewById(R.id.resultTextDado6)
        resultTextDado6.text = dice6Roll.toString()

        val resultTextDado20: TextView = findViewById(R.id.resultTextDado20)
        resultTextDado20.text = dice20Roll.toString()
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