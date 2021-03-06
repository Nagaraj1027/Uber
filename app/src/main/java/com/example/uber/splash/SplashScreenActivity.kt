package com.example.uber.splash

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.example.uber.MainActivity
import com.example.uber.R
import com.example.uber.intent.FirstActivity
import com.example.uber.login.LoginActivity
import com.example.uber.uberapp.UberContants
import com.example.uber.uberapp.UberSharedPreferences

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.e("SplashScreenActivity ", "SplashScreenActivity onCreate ")

        startSplash()
    }

    fun startSplash() {

        Handler().postDelayed({

            //   gotoLogin()
            if (UberSharedPreferences.getNameFromPreferences()
                    .isNotEmpty() && UberSharedPreferences.getPasswordFromPreference().isNotEmpty()
            ) {
                gotoHomeScreen()
            } else {
                gotoLogin()
            }
        }, UberContants.KEY_SPLASH_SCREEN_TIME)

    }

    fun gotoLogin() {
        var gotoFirstAct = Intent(SplashScreenActivity@ this, LoginActivity::class.java)
        startActivity(gotoFirstAct)

        finish()
    }

    fun gotoHomeScreen() {
        var gotoFirstAct = Intent(SplashScreenActivity@ this, MainActivity::class.java)
        startActivity(gotoFirstAct)
    }
}