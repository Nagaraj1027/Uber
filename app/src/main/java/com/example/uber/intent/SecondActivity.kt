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

class SecondActivity : AppCompatActivity() {

    var btnSecondActivity: Button? = null
    var tvSecondActivity: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)

        Log.e("onCreate SecondAct ", "onCreate SecondActivity ")

        btnSecondActivity = findViewById(R.id.btnSecondAct) as Button
        tvSecondActivity = findViewById(R.id.tvSecondAct) as TextView

        tvSecondActivity?.setText("We are in Second Activity")

        var name: String? = intent.getStringExtra(UberContants.LOGGED_IN_USER_KEY)
        Log.e("received name ", name.toString())

        btnSecondActivity?.setOnClickListener(View.OnClickListener {
            gotoFirstAct()
        })

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart SecondAct ", "onStart SecondActivity ")

    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume SecondAct ", "onResume SecondActivity ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause SecondAct ", "onPause SecondActivity ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop SecondAct ", "onStop SecondActivity ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart SecondAct ", "onRestart SecondActivity ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy SecondAct ", "onDestroy SecondActivity ")
    }


    fun gotoFirstAct() {
        // businesss logic
        var gotoFirstAct = Intent(SecondActivity@ this, FirstActivity::class.java)
        startActivity(gotoFirstAct)
    }
}