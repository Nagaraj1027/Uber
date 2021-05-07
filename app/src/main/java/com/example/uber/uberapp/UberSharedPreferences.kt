package com.example.uber.uberapp

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.util.Log
import androidx.core.content.edit

object UberSharedPreferences {

    var sharedPreferences: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null

    fun init(context: Context) {
        Log.e("UberSharedPreferences ", "UberSharedPreferences SingleTon")

        sharedPreferences = context.getSharedPreferences("UberPreferences", MODE_PRIVATE)
        editor = sharedPreferences!!.edit()
    }


    fun saveNameIntoPreferences(name: String) {

        editor!!.putString("KEY_USER_NAME", name)
        editor!!.commit()
    }

    fun getNameFromPreferences(): String {
        var username: String? = sharedPreferences!!.getString("KEY_USER_NAME", "")

        return username!!
    }

    fun savePasswordIntoPreferences(password: String) {

        editor!!.putString("KEY_PASSWORD", password)
        editor!!.commit()
    }

    fun getPasswordFromPreference(): String {

        var password: String? = sharedPreferences!!.getString("KEY_PASSWORD", "")
        return password!!
    }
}