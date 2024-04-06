package com.art.searchengine

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("USER_NAME")
        val textViewName = findViewById<TextView>(R.id.textViewName)
        textViewName.text = "¡Hola, $userName!"

        val button = findViewById<Button>(R.id.buttonGoToRickAndMortyActivity)
        button.setOnClickListener {
            val intent = Intent(this, RickAndMortyActivity::class.java)
            startActivity(intent)
        }
    }
}
