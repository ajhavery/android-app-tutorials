package com.example.apptutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.apptutorial.databinding.ActivityMainBinding
import com.example.apptutorial.databinding.FragmentModalBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentModalBottomSheetBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()
        taskViewModel = ViewModelProvider(activity)[TaskViewModel::class.java]
        binding.saveButton.setOnClickListener {
            saveAction()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentModalBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun saveAction() {
        taskViewModel.name.value = binding.name.text.toString()
        taskViewModel.desc.value = binding.desc.text.toString()
        binding.name.setText("")
        binding.desc.setText("")
        dismiss()
    }

}