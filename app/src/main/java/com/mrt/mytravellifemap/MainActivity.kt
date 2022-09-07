package com.mrt.mytravellifemap

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        fun startActivity(
            activity: Activity
        ) {
            val intent = Intent(activity, MainActivity::class.java)

            activity.startActivity(intent);
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}