package com.example.apptutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.example.apptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var lottieAnimView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        lottieAnimView = activityMainBinding.lottieAnimationView

        lottieAnimView.setAnimation(R.raw.customer_review)
        lottieAnimView.repeatCount = LottieDrawable.INFINITE
        lottieAnimView.playAnimation()

    }
}