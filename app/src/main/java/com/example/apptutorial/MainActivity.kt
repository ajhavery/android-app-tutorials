package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.example.apptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var textAnimText: TextView
    private lateinit var translate: Animation
    private lateinit var rotate: Animation
    private lateinit var scale: Animation
    private lateinit var alpha: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        textAnimText = activityMainBinding.textAnimText

        activityMainBinding.btnTranslate.setOnClickListener {
            translate = AnimationUtils.loadAnimation(this, R.anim.translate)
            textAnimText.startAnimation(translate)
        }

        activityMainBinding.btnRotate.setOnClickListener{
            rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textAnimText.startAnimation(rotate)
        }

        activityMainBinding.btnScale.setOnClickListener{
            scale = AnimationUtils.loadAnimation(this, R.anim.scale)
            textAnimText.startAnimation(scale)
        }

        activityMainBinding.btnAlpha.setOnClickListener{
            alpha = AnimationUtils.loadAnimation(this, R.anim.alpha)
            textAnimText.startAnimation(alpha)
        }

    }
}