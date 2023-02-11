package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class passwordchange_page : AppCompatActivity() {

    lateinit var pcbtnchangepassword : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passwordchange_page)

        pcbtnchangepassword = findViewById(R.id.pcbtnchangepassword)

        pcbtnchangepassword.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}