package com.example.membership

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class Clients: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.clients_activity)

        findViewById<TextView>(R.id.header).text = intent.getStringExtra("email")
    }
}