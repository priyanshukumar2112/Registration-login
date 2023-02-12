package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class passwordchange_page : AppCompatActivity() {

    lateinit var pcbtnchangepassword : Button
    lateinit var pcetenternewpassword : EditText
    lateinit var pcetreenterpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passwordchange_page)

        pcbtnchangepassword = findViewById(R.id.pcbtnchangepassword)
        pcetenternewpassword = findViewById(R.id.pcetenternewpassword)
        pcetreenterpassword = findViewById(R.id.pcetreenterpassword)

        pcbtnchangepassword.setOnClickListener{
            if(pcetenternewpassword.text.toString().isEmpty()){
                pcetenternewpassword.error = "Enter New password"}
               else if( pcetenternewpassword.text.length<6 ){
                   pcetenternewpassword.error = "Password contain minimum 6 digit"
               }
            else if(pcetreenterpassword.text.toString().isEmpty()){
                pcetreenterpassword.error = "Re-enter your password"}

            else if(pcetreenterpassword.text.toString().equals(pcetenternewpassword.text.toString())){
                startActivity(Intent(this, MainActivity::class.java))
                Toast.makeText(this, "Password Changed successfully", Toast.LENGTH_LONG).show()
            }
            else {
                pcetreenterpassword.error= "Password doesn't match"

            }
        }

    }
}