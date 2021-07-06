package com.example.android.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class GreetingCard : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA ="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_card)
        val intent =intent
        val name = intent.getStringExtra(NAME_EXTRA)
        val GC: TextView= findViewById(R.id.GC)
        GC.text ="Happy Birthday $name!"


    }
}