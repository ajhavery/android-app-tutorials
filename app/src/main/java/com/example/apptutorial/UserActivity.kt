package com.example.apptutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptutorial.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId", R.drawable.profile_2)

        binding.textName.text = name
        binding.textPhoneNo.text = phone
        binding.textCountryName.text = country
        binding.profileImage.setImageResource(imageId)
    }
}
