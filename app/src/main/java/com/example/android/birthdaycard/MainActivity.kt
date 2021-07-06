package com.example.android.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun action(view: View) {
        val edit: EditText =findViewById(R.id.edit_query)
        val name=edit.editableText.toString()

        val intent=Intent(this,GreetingCard::class.java)
        intent.putExtra(GreetingCard.NAME_EXTRA, name)
        startActivity(intent)
    }
}