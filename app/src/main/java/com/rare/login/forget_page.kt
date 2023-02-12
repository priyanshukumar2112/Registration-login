package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class forget_page : AppCompatActivity() {

    lateinit var fpbtngetotp : Button
    lateinit var fpetenteremail : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_page)

        fpbtngetotp = findViewById(R.id.fpbtngetotp)
        fpetenteremail = findViewById(R.id.fpetenteremail)

        fpbtngetotp.setOnClickListener{

            if(fpetenteremail.text.toString().trim().isEmpty()){
                    fpetenteremail.error = "Enter your Correct Email"

            }

            else if (fpetenteremail.text.toString().trim().endsWith("@gmail.com", ignoreCase = false))
            {
                startActivity(Intent(this, verify_otp::class.java))
                Toast.makeText(this, "OTP Sent", Toast.LENGTH_SHORT).show()

            }
                else {
                fpetenteremail.error = "Email must contain @gmail.com"
            }

        }
    }
}