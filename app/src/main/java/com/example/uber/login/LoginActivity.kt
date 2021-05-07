package com.example.uber.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uber.MainActivity
import com.example.uber.R
import com.example.uber.uberapp.UberSharedPreferences

class LoginActivity : AppCompatActivity() {

    var etUserName: EditText? = null
    var etPassword: EditText? = null
    var btnLogin: Button? = null
    var tvInfo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUserName = findViewById(R.id.etUserName) as EditText
        etPassword = findViewById(R.id.etPassword) as EditText
        btnLogin = findViewById(R.id.btnLogin) as Button
        tvInfo = findViewById(R.id.tvInfo) as TextView

        btnLogin!!.setOnClickListener(View.OnClickListener {

            var userName: String = etUserName!!.text.toString()
            var password: String = etPassword!!.text.toString()

            UberSharedPreferences.saveNameIntoPreferences(userName)
            UberSharedPreferences.savePasswordIntoPreferences(password)

            Log.e(" insertedName ", UberSharedPreferences.getNameFromPreferences())
            Log.e("inserted password ", UberSharedPreferences.getPasswordFromPreference())

            tvInfo!!.setText("Login details are saved into Preferences")

            Toast.makeText(
                applicationContext,
                "Login details are saved into Preferences ",
                Toast.LENGTH_LONG
            ).show()

            gotoHomeScreen()

        })


    }

    fun gotoHomeScreen() {
        var gotoFirstAct = Intent(SplashScreenActivity@ this, MainActivity::class.java)
        startActivity(gotoFirstAct)
    }
}