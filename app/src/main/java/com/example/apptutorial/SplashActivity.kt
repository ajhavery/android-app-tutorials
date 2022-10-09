package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.apptutorial.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var activitySplashBinding: ActivitySplashBinding
    private lateinit var iHome: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(activitySplashBinding.root)

        iHome = Intent(this@SplashActivity, MainActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(iHome)
        }, 1000)
    }
}