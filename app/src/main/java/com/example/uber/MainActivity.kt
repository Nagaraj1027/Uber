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
import com.example.uber.implicitintent.ImplicitIntentExample
import com.example.uber.intent.FirstActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var btnGotoIntent: Button? = null
    var btnGotoImplicitIntent: Button? = null
    var btnGotoFragemnts: Button? = null
    //why ?/!!

    //!!
    //?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println("Hello")

        initViews()

        //Explicit Intent
        //Implicit Intent
    }

    fun initViews() {

        btnGotoIntent = findViewById(R.id.btnGotoIntent) as Button
        btnGotoImplicitIntent = findViewById(R.id.btnGotoImplicitIntent) as Button
        btnGotoFragemnts = findViewById(R.id.btnGotoFragemnts) as Button


        btnGotoIntent!!.setOnClickListener(this)
        btnGotoImplicitIntent!!.setOnClickListener(this)
        btnGotoFragemnts!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.btnGotoIntent ->
                gotoIntent()

            R.id.btnGotoImplicitIntent ->
                gotoImplicitIntent()

            R.id.btnGotoFragemnts ->
                gotoFragments()
        }

    }

    fun gotoIntent() {
        var gotoFirstAct = Intent(MainActivity@ this, FirstActivity::class.java)
        startActivity(gotoFirstAct)
    }

    fun gotoImplicitIntent() {
        var gotoFirstAct = Intent(MainActivity@ this, ImplicitIntentExample::class.java)
        startActivity(gotoFirstAct)
    }

    fun gotoFragments() {
        var gotoFirstAct = Intent(MainActivity@ this, ImplicitIntentExample::class.java)
        startActivity(gotoFirstAct)
    }
}