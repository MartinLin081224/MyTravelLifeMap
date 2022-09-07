package com.mrt.mytravellifemap

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation

class Splash : AppCompatActivity(), Animation.AnimationListener {
    companion object {
        fun startActivity(
            activity: Activity,
        ) {
            val intent = Intent(activity, Splash::class.java)

            activity.startActivity(intent)
        }
    }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            MainActivity.startActivity(this)
        }, 2000)
    }

    override fun onAnimationStart(p0: Animation?) {
        TODO("Not yet implemented")
    }

    override fun onAnimationEnd(p0: Animation?) {
        TODO("Not yet implemented")
        MainActivity.startActivity(this)
    }

    override fun onAnimationRepeat(p0: Animation?) {
        TODO("Not yet implemented")
    }
}