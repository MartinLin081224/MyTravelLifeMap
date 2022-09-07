package com.mrt.mytravellifemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MRT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mrt)

        callback()

    }

    private fun callback() {
        Splash.startActivity(this)
    }
}