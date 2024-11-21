package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginForm : AppCompatActivity() {

    lateinit var TextView: TextView
    lateinit var first: TextView
    lateinit var last: TextView
    lateinit var email: TextView
    lateinit var password: TextView
    lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        first=findViewById(R.id.First)
        TextView=findViewById(R.id.textView)
        last=findViewById(R.id.last)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        button=findViewById(R.id.button)

        setContentView(R.layout.activity_login_form)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.First)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}