package com.example.uber

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.intent.FirstActivity

class MainActivity : AppCompatActivity() {

    var btnGotoIntent: Button? = null

    //why ?/!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println("Hello")

        btnGotoIntent = findViewById(R.id.btnGotoIntent) as Button

        btnGotoIntent!!.setOnClickListener(View.OnClickListener {

            var gotoFirstAct = Intent(MainActivity@ this, FirstActivity::class.java)
            startActivity(gotoFirstAct)
        })
    }
}