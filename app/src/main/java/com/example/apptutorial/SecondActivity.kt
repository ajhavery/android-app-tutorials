package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptutorial.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var activitySecondBinding: ActivitySecondBinding
    private lateinit var username: String
    private lateinit var password: String
    private lateinit var phone: Number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(activitySecondBinding.root)

        username = intent.getStringExtra("Username").toString()
        password = intent.getStringExtra("Password").toString()
        phone = intent.getLongExtra("Phone", 0)

        activitySecondBinding.textUsername.text = String.format("Username: %s", username)
        activitySecondBinding.textPassword.text = String.format("Password: %s", password)
        activitySecondBinding.textPhone.text = String.format("Phone: %s", phone)
    }
}