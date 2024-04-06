package com.art.searchengine

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout
import android.widget.TextView

class PARCIALSEGUNDOCORTE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcialsegundocorte)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonOK = findViewById<Button>(R.id.buttonOK)

        buttonOK.setOnClickListener {
            val userName = editTextName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_NAME", userName)
            startActivity(intent)
        }
    }
}
