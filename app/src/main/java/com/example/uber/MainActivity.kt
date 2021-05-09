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

    //why ?/!!

    //? : As kotlin is null safe language. so when we initialize a string or any data type in kotlin, it does not take null.
    // for example: var a: String= null ; will throw compilation error
    // so inorder to enable the variable to take null, we use ?.

    //!! : the not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.

/*
    a: String? |           a.length |           a?.length |           a!!.length |
    +------------+--------------------+---------------------+----------------------+
    |      "cat" | Compile time error |                   3 |                    3 |
    |       null | Compile time error |                null | NullPointerException |

*/
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


        btnGotoIntent!!.setOnClickListener(this)
        btnGotoImplicitIntent!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.btnGotoIntent ->
                gotoIntent()

            R.id.btnGotoImplicitIntent ->
                gotoImplicitIntent()
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
}