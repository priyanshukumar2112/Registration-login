package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etemail : EditText
    lateinit var etpassword : EditText
    lateinit var btnlogin : Button
    lateinit var tvregisterhere : TextView
    lateinit var tvforgetpassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etemail = findViewById(R.id.etemail)
        etpassword = findViewById(R.id.etpassword)
        btnlogin = findViewById(R.id.btnlogin)
        tvregisterhere = findViewById(R.id.tvregisterhere)
        tvforgetpassword = findViewById(R.id.tvforgetpassword)

        tvforgetpassword.setOnClickListener{
            startActivity(Intent(this, forget_page::class.java))
        }

        tvregisterhere.setOnClickListener {
            startActivity(Intent(this, registeration_page::class.java))
        }

        btnlogin.setOnClickListener {
            if(etemail.text.toString().trim().isEmpty()){

                    etemail.error = "Enter your Email Address"
            }

            else if (etpassword.text.toString().isEmpty()){
                etpassword.error = "Enter your Password"
            }
            else if (etpassword.text.toString().length<6){
                etpassword.error = "Password contain atleast 6 digit"
            }
            else{
                if(etemail.text.toString().contains("@gmail.com")) {
                    startActivity(Intent(this, welcome::class.java))
                    Toast.makeText(this, "Login Successfuly", Toast.LENGTH_LONG).show()
                }
                else{
                    etemail.error = "Email must contain '@gmail.com'"
                }
            }

        }
    }
}