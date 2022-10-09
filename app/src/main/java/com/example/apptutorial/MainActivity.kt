package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var iNext: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        iNext = Intent(this@MainActivity, SecondActivity::class.java)
        iNext.putExtra("Username", "Abhishek")
        iNext.putExtra("Password", "pass123")
        iNext.putExtra("Phone", 9811640191)

        activityMainBinding.btnMain.setOnClickListener{
            startActivity(iNext)
        }
    }
}