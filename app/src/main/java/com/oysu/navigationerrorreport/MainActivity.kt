package com.oysu.navigationerrorreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // This show an error!!
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}