package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val logTAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.d(logTAG, "onDestroy")
    }
}