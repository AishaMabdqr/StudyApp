package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidContents : AppCompatActivity() {

    lateinit var clMain : ConstraintLayout
    lateinit var rvCards : RecyclerView
    lateinit var titlesList : Array<String>
    lateinit var contentList : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_contents)

        val list = arrayListOf(
            arrayListOf("Snackbar", "Displaying Alert in App", " used to display alert in our app " ),
            arrayListOf("Recycler view", "One type of Views", "Displaying Long List in App" ),
            arrayListOf("Alert Dialogs ", "Displaying Alert in App", " give us more flexibility by allowing us to use buttons and get user input in our alerts")
        )

        clMain = findViewById(R.id.clMain)
        rvCards = findViewById(R.id.rvCards)

        rvCards.adapter = MessageAdapter(this, list)
        rvCards.layoutManager = LinearLayoutManager (this)

        title = " Android Materials"
    }
}