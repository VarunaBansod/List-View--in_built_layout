package com.example.listviewproj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listViewVar =  findViewById<ListView>(R.id.listView)

        val tasklist = arrayListOf<String>()
        tasklist.add("Learn Java")
        tasklist.add("Learn Android App development")
        tasklist.add("Learn kotlin")
        tasklist.add("Learn figma")
        tasklist.add("Learn AI")
        tasklist.add("Complete App Dev Course")
        tasklist.add("Make many projects")
        tasklist.add("Give Interview")
        tasklist.add("Make Great Portfolio")
        tasklist.add("Learn C#")
        tasklist.add("Buy phone")
        tasklist.add("Buy tablet for designing")

        //adapter is used to link View and List
        val adapterForMyList = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasklist)

        listViewVar.adapter = adapterForMyList

        listViewVar.setOnItemClickListener { adapterView, view, i, l ->
            val text ="clicked on Item" + (view as TextView).text.toString()
            Toast.makeText(this, text ,Toast.LENGTH_SHORT).show()
        }
    }
}