package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button_h)
        val buttonn : Button = findViewById(R.id.button_count)
        val textView : TextView = findViewById(R.id.textView)
        val imageButton : ImageButton = findViewById(R.id.imageButton)
        button.setOnClickListener{
            textView.text = getString(R.string.hello_friend)
        }
        buttonn.setOnClickListener{
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }
        imageButton.setOnClickListener{
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }
    }
}