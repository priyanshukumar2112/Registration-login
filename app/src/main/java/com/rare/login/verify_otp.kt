package com.rare.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class verify_otp : AppCompatActivity() {

    lateinit var voetotp_1 : EditText
    lateinit var voetotp_2 : EditText
    lateinit var voetotp_3 : EditText
    lateinit var voetotp_4 : EditText
    lateinit var vobtnverifyotp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        vobtnverifyotp = findViewById(R.id.vobtnverifyotp)
        voetotp_1 = findViewById(R.id.voetotp_1)
        voetotp_2 = findViewById(R.id.voetotp_2)
        voetotp_3 = findViewById(R.id.voetotp_3)
        voetotp_4 = findViewById(R.id.voetotp_4)

        vobtnverifyotp.setOnClickListener{
            if(voetotp_1.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
            }
                //1
                else {
                    if(voetotp_1.text.toString().trim().length>1) {
                     Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                      }
                        //2
                        else{
                            if(voetotp_2.text.toString().trim().isEmpty() ){
                            Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                            }

                             else{
                                if(voetotp_2.text.toString().trim().length>1) {
                                   Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                                 }
                                    else{
                                        if(voetotp_3.text.toString().trim().isEmpty() ){
                                        Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                                        }

                                        else{
                                            if(voetotp_3.text.toString().trim().length>1) {
                                                Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                                            }

                                            else{
                                                if(voetotp_4.text.toString().trim().isEmpty() ){
                                                Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                                                 }
                                                else {
                                                    if(voetotp_4.text.toString().trim().length>1) {
                                                        Toast.makeText(this, "WRONG OTP", Toast.LENGTH_SHORT).show()
                                                    }
                                                    else{
                                                        Toast.makeText(this, "Otp verified", Toast.LENGTH_SHORT).show()
                                                        startActivity(Intent(this, passwordchange_page::class.java))
                                                    }
                                                }

                                            }

                                        }



                                        }

                }
                }
            }


           }


    }
}