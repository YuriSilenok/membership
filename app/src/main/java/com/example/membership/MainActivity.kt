package com.example.membership

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.auth).setOnClickListener {
            Log.i("Click", "auth")

            val intent = Intent(this, Clients::class.java)
            intent.putExtra("email", "yuri.silenok@gmail.com")
            startActivity(intent)
        }
    }
}