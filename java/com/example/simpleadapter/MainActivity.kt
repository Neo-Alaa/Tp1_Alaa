package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)

        val items: List<Map<String, String>> = listOf(
            mapOf("Key" to "Club", "description" to "Barcelona"),
            mapOf("Key" to "Legend : ", "description" to "Cruyff"),
            mapOf("Key" to "Legend : ", "description" to "Maradona"),
            mapOf("Key" to "SuperStar : ", "description" to "Neymar"),
            mapOf("Key" to "GOAT   : ", "description" to "Messi")
        )


        val from = arrayOf("Key", "description")

        val to = intArrayOf(R.id.titleTextView, R.id.descriptionTextView)

        val adapter = SimpleAdapter(this, items, R.layout.elements, from, to)
        listView.adapter = adapter
    }
}
