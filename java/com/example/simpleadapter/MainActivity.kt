package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ListView
        val listView: ListView = findViewById(R.id.listView)

        // Data to be displayed in the ListView
        val items: List<Map<String, String>> = listOf(
            mapOf("title" to "Club", "description" to "Barcelona"),
            mapOf("title" to "Legend : ", "description" to "Cruyff"),
            mapOf("title" to "Legend : ", "description" to "Maradona"),
            mapOf("title" to "Legend : ", "description" to "Neymar"),
            mapOf("title" to "GOAT   : ", "description" to "Messi")
        )

        // Keys from the map to use in the adapter
        val from = arrayOf("title", "description")

        // IDs of the views in item_map.xml to bind data to
        val to = intArrayOf(R.id.titleTextView, R.id.descriptionTextView)

        // Set up the SimpleAdapter
        val adapter = SimpleAdapter(this, items, R.layout.item_text, from, to)
        listView.adapter = adapter
    }
}
