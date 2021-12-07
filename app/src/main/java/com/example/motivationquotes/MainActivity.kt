package com.example.motivationquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_main=findViewById<TextView>(R.id.tv_main)
        val quotes = arrayOf<String>(
            "Take the Risk or Lose the Game",
            "You cant just wish for a better Life",
            "When something is important enough, you do it even if the odds are not in your favor.",
            "Start where you are. Use what you have. Do what you can.",
            "Ever tried. Ever failed. No matter. Try Again. Fail again. Fail better.",
            "Don't watch the clock; do what it does. Keep going.",
            "Aim for the moon. If you miss, you may hit a star.",
            "You will never win if you never begin.",
            "Setting goals is the first step in turning the invisible into the visible.",
            "Happiness is not something ready-made it comes from your own action.")
        val nxt = findViewById<Button>(R.id.bt_nxt)
        var i = 1
        tv_main.setText(quotes[0])
        fun another() {
            var qt = quotes[i]
            tv_main.setText(qt)
            i++
        }
        nxt.setOnClickListener {
        another();
        }
        }
}

