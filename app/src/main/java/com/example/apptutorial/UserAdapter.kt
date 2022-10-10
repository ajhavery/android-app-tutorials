package com.example.apptutorial

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

// Array adapter takes 3 arguments: context, template of list, list of items
// UserAdapter class will extend this ArrayAdapter class
class UserAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.custom_list_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.custom_list_item, null)

        val imageView: ImageView = view.findViewById(R.id.circleImageProfile)
        val userName: TextView = view.findViewById(R.id.textName)
        val lastMessage : TextView = view.findViewById(R.id.textMessage)
        val lastMsgTime: TextView = view.findViewById(R.id.textLastSeen)

        // Setting values to the views from the arrayList
        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].name
        lastMessage.text = arrayList[position].lastMessage
        lastMsgTime.text = arrayList[position].lastMessageTime

        return view
    }
}