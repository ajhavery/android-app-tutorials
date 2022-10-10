package com.example.apptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.apptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var listView: ListView
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        // Array = fixed size // Array list = mutable size
        val imageId = intArrayOf(
            R.drawable.profile_1, R.drawable.profile_2, R.drawable.profile_3,
            R.drawable.profile_4, R.drawable.profile_5, R.drawable.profile_6,
            R.drawable.profile_7, R.drawable.profile_8
        )
        val name = arrayOf("Ram", "Shyam", "Sita", "Gita", "Lakshman", "Ramesh", "Suresh")
        val lastMessage = arrayOf(
            "Hi, How are you?",
            "Call me asap.",
            "Today is a good day!",
            "Looking forward to meet you!",
            "Fine by me.",
            "Lets evaluate!",
            "Awesome!"
        )
        val lastMsgTime =
            arrayOf("8:00PM", "7:30AM", "12:15PM", "5:30PM", "11:15PM", "10:30PM", "9:11AM")
        val phoneNo = arrayOf(
            "9811641234", "9811641235", "9811641236", "9811641237",
            "9811641238", "9811641239", "9811641231"
        )
        val country = arrayOf(
            "India", "India", "USA", "UK",
            "India", "Bangladesh", "Nepal"
        )

        userArrayList = ArrayList()
        for (i in name.indices) {
            val user =
                User(name[i], lastMessage[i], lastMsgTime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }

        // Array Adapter sets the items of array to the ListView
        listView = activityMainBinding.listView
        listView.adapter = UserAdapter(this, userArrayList)
        listView.isClickable = true

        // list view item click listener
        listView.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("phone", phone)
            intent.putExtra("country", country)
            intent.putExtra("imageId", imageId)

            startActivity(intent)
        }

    }
}