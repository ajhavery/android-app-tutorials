package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner
import android.widget.SpinnerAdapter
import com.example.apptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var listView: ListView
    private lateinit var spinner: Spinner
    private lateinit var autoCompleteTextView: AutoCompleteTextView
    private lateinit var arrListView: ArrayList<String>
    private lateinit var arrDropDownOptions: ArrayList<String>
    private lateinit var arrAutoComplete: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        // ListView
        arrListView = arrayListOf("Ram", "Shyam", "Sita", "Gita")

        val listAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrListView)

        listView = activityMainBinding.listView
        listView.adapter = listAdapter

        // Spinner
        arrDropDownOptions = arrayListOf(
            "Aadhaar Card", "PAN Card", "Voter ID",
            "Passport", "Ration Card", "Driving License"
        )

        val spinnerAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrDropDownOptions)

        spinner = activityMainBinding.spinner
        spinner.adapter = spinnerAdapter

        // Auto complete text
        arrAutoComplete = arrayListOf("C", "C++", "Java", "Python", "Php")

        val autoCompleteAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrAutoComplete)

        autoCompleteTextView = activityMainBinding.acptTextview
        autoCompleteTextView.setAdapter(autoCompleteAdapter)
        autoCompleteTextView.threshold = 1 // characters to type before showing suggestions

    }
}