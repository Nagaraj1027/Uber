package com.example.uber.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uber.R

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment onCreate ", "onStart FirstFragment ")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)

        Log.e("FirstFragment onCreatV ", "onStart FirstFragment ")
    }

    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment onStart ", "onStart FirstFragment ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment onResume ", "onStart FirstFragment ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment onPause ", "onStart FirstFragment ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment onStop ", "onStart FirstFragment ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FrstFrag onDestroyView ", "onStart FirstFragment ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFrag onDestroy ", "onStart FirstFragment ")
    }


}