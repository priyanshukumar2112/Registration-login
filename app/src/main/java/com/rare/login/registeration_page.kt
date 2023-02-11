package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registeration_page : AppCompatActivity() {

    lateinit var rpbtnregister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration_page)

        rpbtnregister = findViewById(R.id.rpbtnregister)


        rpbtnregister.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}