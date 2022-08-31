package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show this layout file: activity_main
        setContentView(R.layout.activity_main)


        //User can tap a button to change the text color of the label.
        // 1. add a button to our layout

        // Get a reference to button
        // 2. set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // handles button top
            // 2. change the color of the text
            Log.i("Abdinahmen", "Tapped on button")
            // 1. Get a reference to the textview
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
    }
}