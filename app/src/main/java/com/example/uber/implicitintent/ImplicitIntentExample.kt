package com.example.uber.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.R

class ImplicitIntentExample : AppCompatActivity() {

    var btnImplicitIntent: Button? = null
    var tvImplicitIntent: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_implicit)

        Log.e("onCreate FirstAct ", "onCreate FirstAct ")

        btnImplicitIntent = findViewById(R.id.btnImplicitIntent) as Button

        btnImplicitIntent!!.setOnClickListener(View.OnClickListener {

            var gotoImplicitIntent = Intent(Intent.ACTION_VIEW)
            gotoImplicitIntent.data = Uri.parse("http://www.google.com")
            startActivity(gotoImplicitIntent)
        })


    }
}