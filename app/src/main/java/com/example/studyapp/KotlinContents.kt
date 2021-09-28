package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinContents : AppCompatActivity() {

    lateinit var clMain : ConstraintLayout
    lateinit var rvCards : RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_contents)

        val list = arrayListOf(
            arrayListOf("Var and Val", "Declaring Variables", "1- Var -> used for mutable variables \n 2-Val -> used for immutable variables \n" ),
            arrayListOf("User Input", "Getting User Input", "val name = readLine() allows user to enter a value" ),
            arrayListOf("String Concatenation", "Explaining String Concatenation", " refers to combining strings using + sign \n EX: print (name + msg )\n")
        )

        clMain = findViewById(R.id.clMain)
        rvCards = findViewById(R.id.rvCards)

        rvCards.adapter = MessageAdapter(this, list)
        rvCards.layoutManager = LinearLayoutManager (this)

        title = " Kotlin Materials"

    }
}