package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forget_page : AppCompatActivity() {

    lateinit var fpbtngetotp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_page)

        fpbtngetotp = findViewById(R.id.fpbtngetotp)

        fpbtngetotp.setOnClickListener{
            startActivity(Intent(this, verify_otp::class.java))

        }
    }
}