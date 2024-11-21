package com.example.firstapp

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class InteractionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnSnack:Button
        lateinit var main:ConstraintLayout
        lateinit var btnAlert:Button
        lateinit var btnToast:Button

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interaction)

        main=findViewById(R.id.main)
        btnSnack=findViewById(R.id.btnSnack)
        btnToast=findViewById(R.id.btnToast)
        btnAlert=findViewById(R.id.btnAlert)


        btnToast.setOnClickListener{
            Toast.makeText(this@InteractionActivity,
                "login sucess",Toast.LENGTH_LONG)
        }

        btnSnack.setOnClickListener{
            Snackbar.make(main,
                "invalid login",Snackbar.LENGTH_LONG).
            setAction("Close",{}).show()
        }
        
        btnAlert.setOnClickListener{
            var alert=AlertDialog.Builder(this@InteractionActivity)
            alert.setTitle("COnfirm")
                .setMessage("are you sure")
                .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->  })
                .setPositiveButton("No", DialogInterface.OnClickListener { dialog, which ->  })
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}