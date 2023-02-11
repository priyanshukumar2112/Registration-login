package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verify_otp : AppCompatActivity() {

    lateinit var vobtnverifyotp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        vobtnverifyotp = findViewById(R.id.vobtnverifyotp)

        vobtnverifyotp.setOnClickListener{

            startActivity(Intent(this, passwordchange_page::class.java))
        }


    }
}