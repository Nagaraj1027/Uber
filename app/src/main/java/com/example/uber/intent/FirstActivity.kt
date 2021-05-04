package com.example.uber.intent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.R
import com.example.uber.uberapp.UberContants

class FirstActivity : AppCompatActivity() {

    var btnFirstAct: Button? = null
    var tvFirstAct: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_first)

        Log.e("onCreate FirstAct ", "onCreate FirstAct ")

        btnFirstAct = findViewById(R.id.btnFirstAct) as Button
        tvFirstAct = findViewById(R.id.tvFirstAct) as TextView

        tvFirstAct?.setText("We are in First Activity")

        btnFirstAct?.setOnClickListener(View.OnClickListener {
            gotoSecondAct()
        })

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart FirstAct ", "onStart FirstAct ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume FirstAct ", "onResume FirstAct ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause FirstAct ", "onPause FirstAct ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop FirstAct ", "onStop FirstAct ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart FirstAct ", "onRestart FirstAct ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy FirstAct ", "onDestroy FirstAct ")
    }


    fun gotoSecondAct() {
        // businesss logic
        var gotoSecondAct = Intent(FirstActivity@ this, SecondActivity::class.java)
        gotoSecondAct.putExtra(UberContants.LOGGED_IN_USER_KEY, UberContants.LOGGED_IN_USER_VALUE)
        startActivity(gotoSecondAct)
    }


}