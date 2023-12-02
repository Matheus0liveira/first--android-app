package com.matheus0liveira.firstproject

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.core.widget.doAfterTextChanged
import android.view.View.OnClickListener
import android.widget.TextView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var emailValue: String
        lateinit var passwordValue: String


        val inputEmailText: EditText = findViewById(R.id.input_form_email)
        val inputPasswordText: EditText = findViewById(R.id.input_form_password)
        val submitBtn: Button = findViewById(R.id.btn_form_submit)

        inputEmailText.doAfterTextChanged { emailValue = it.toString() }
        inputPasswordText.doAfterTextChanged { passwordValue = it.toString() }
        submitBtn.setOnClickListener{
            Log.i("---SUBMIT---", "Email: $emailValue, password: $passwordValue")

            val emailResult = findViewById<TextView>(R.id.email_result)
            val passwordResult = findViewById<TextView>(R.id.password_result)

            emailResult.text = emailValue
            passwordResult.text = passwordValue
        }
    }
}