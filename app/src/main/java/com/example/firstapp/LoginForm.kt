package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginForm : AppCompatActivity() {
    lateinit var First: First
    lateinit var Last: Last
    lateinit var Email: Email
    lateinit var Password: Password
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_form)



        First=findViewById(R.id.First)
        Last= findViewById(R.id.Last)
        Email= findViewById(R.id.Email)
        Password=findViewById(R.id.Password)

        button.setOnClickListener{
            val data:String=Password.text.toString()
            Password.text =data

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}