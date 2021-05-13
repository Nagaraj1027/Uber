package com.example.uber.fragments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.R

class FragmentsAactivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments)
        Log.e("FragmentsAct onCreate ", "onStart FirstAct ")
    }


    override fun onStart() {
        super.onStart()
        Log.e("FragmentsAct  ", "onStart FirstAct ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Frgmntact onResume ", "onResume FirstAct ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Frgmntact onPause ", "onPause FirstAct ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Frgmntact onStop ", "onStop FirstAct ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Frgmntact onRestart ", "onRestart FirstAct ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Frgmntact onDestroy ", "onDestroy FirstAct ")
    }
}