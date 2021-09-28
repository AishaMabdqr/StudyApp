package com.example.studyapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var clMain : ConstraintLayout
    lateinit var kotlin : Button
    lateinit var android : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain = findViewById(R.id.clMain)

        kotlin = findViewById(R.id.kotlin)
        kotlin.setOnClickListener{ startGame(KotlinContents()) }

        android = findViewById(R.id.android)
        android.setOnClickListener{ startGame(AndroidContents()) }

        title = "Main Activity"
    }

    private fun startGame(activity : Activity){
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }
}