package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate has been called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause has been called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart has been called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart has been called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume has been called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop has been called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy has been called")
    }

}