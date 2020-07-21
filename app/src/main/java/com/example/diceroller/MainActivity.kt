package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollButton.setOnClickListener {
                rollDice()
            }


        }
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val message = Message()
        val newMessOne = message.one()
        val newMessTwo = message.two()
        val newMessThree = message.three()
        val newMessFour = message.four()
        val newMessFive = message.five()
        val newMessSix = message.six()

        val resultTextView2: TextView = findViewById(R.id.textView2)
        when (diceRoll) {
            1 -> resultTextView2.text = newMessOne
            2 -> resultTextView2.text = newMessTwo
            3 -> resultTextView2.text = newMessThree
            4 -> resultTextView2.text = newMessFour
            5 -> resultTextView2.text = newMessFive
            6 -> resultTextView2.text = newMessSix
        }
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription = diceRoll.toString()

    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Message(){
    private val once = "hmmm No. 1 huh? Like Avi xD That's Great"
    val doce = "No.2 umm? Just Try A Little Bit More My friend That's Good"
    val trece = "Okay So You're No.3 That Means You're Average And That's Pretty Average Too Haha"
    val quince = "No. 4 Means You're Below Average Try Hard Man and That's bad  "
    val cinco = "No.5 You Have To Try Very Hard That's Big Sad "
    val siete = "Kon Ho Aap Kaha Se Aaye Ho Kyuki Aap Kahi Nahi Ho LOL"
    fun one():  String {
        return (once)
    }
    fun two():  String {
        return (doce)
    }
    fun three(): String {
        return (trece)
    }
    fun four():String {
        return (quince)
    }
    fun five(): String {
        return (cinco)
    }
    fun six():String {
        return (siete)
    }

}