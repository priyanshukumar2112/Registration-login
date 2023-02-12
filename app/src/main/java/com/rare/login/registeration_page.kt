package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class registeration_page : AppCompatActivity() {

    lateinit var rpbtnregister : Button
    lateinit var rpetemail : EditText
    lateinit var rpetname : EditText
    lateinit var rpetphno : EditText
    lateinit var rpetpassword : EditText
    lateinit var rpetcnfpassword : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration_page)

        rpbtnregister = findViewById(R.id.rpbtnregister)
        rpetemail = findViewById(R.id.rpetemail)
        rpetname = findViewById(R.id.rpetname)
        rpetphno = findViewById(R.id.rpetphno)
        rpetpassword = findViewById(R.id.rpetpassword)
        rpetcnfpassword = findViewById(R.id.rpetcnfpassword)


        rpbtnregister.setOnClickListener{
            if(rpetemail.text.toString().trim().isEmpty()){
                rpetemail.error ="Enter your email"
            }
            else {
                if (rpetemail.text.toString().trim().endsWith("@gmail.com")){
                if(rpetname.text.toString().trim().isEmpty()){
                rpetname.error ="Enter your Name"
            }
            else if(rpetphno.text.toString().trim().isEmpty()){
                rpetphno.error ="Enter your Name"
            }
            else if(rpetpassword.text.toString().isEmpty()){
                rpetpassword.error ="Enter Password"
            }
            else if(rpetpassword.text.toString().length<6){
                rpetpassword.error ="Password contain atleast 6 digit"
            }
            else if(rpetcnfpassword.text.toString().isEmpty()){
                rpetcnfpassword.error ="Enter Password"
            }
            else if (rpetcnfpassword.text.toString().equals(rpetpassword.text.toString())) {
                    startActivity(Intent(this, MainActivity::class.java))
                    Toast.makeText(this, "Registered", Toast.LENGTH_LONG).show()
                    }
                    else {
                    rpetcnfpassword.error ="Password doesn't match"
                    }
                }
             else {
                    rpetemail.error ="Email must contain '@gmail.com'"
                }
            }
        }

    }

}