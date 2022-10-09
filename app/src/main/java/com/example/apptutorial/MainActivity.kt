package com.example.apptutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.apptutorial.databinding.ActivityMainBinding
import com.example.apptutorial.databinding.FragmentModalBottomSheetBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var modalBinding: FragmentModalBottomSheetBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        modalBinding = FragmentModalBottomSheetBinding.inflate(layoutInflater)

        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        taskViewModel.name.observe(this) {
            activityMainBinding.textTask.text = String.format("Task Name: %s", it)
        }
        taskViewModel.desc.observe(this) {
            activityMainBinding.textDesc.text = String.format("Task Desc: %s", it)
        }

        activityMainBinding.btnLogin.setOnClickListener {
            ModalBottomSheet().show(supportFragmentManager, "credentialsTag")
            modalBinding.textEmail.text =
                String.format("Email: %s", activityMainBinding.editEmail.text)
            modalBinding.textPassword.text =
                String.format("Password: %s", activityMainBinding.editPassword.text)
        }

        activityMainBinding.btnShowDialog.setOnClickListener {
            ModalBottomSheet().show(supportFragmentManager, "credentialsTag")
        }
    }
}