package com.example.uber.uberapp

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.R

class UberApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.e("UberApplication ", "UberApplication onCreate ")
        UberSharedPreferences.init(this)


    }
}