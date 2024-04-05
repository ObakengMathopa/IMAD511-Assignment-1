package com.example.myapplication

import android.net.ipsec.ike.ChildSaProposal
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }   //Declaring the views
    val ageNumber = findViewById<EditText>(R.id.ageNumber)
    val btnGenrate = findViewById<Button>(R.id.btnGenerate)
    val btnCnacel = findViewById<Button>(R.id.btnClear)
    val txtResult = findViewById<TextView>(R.id.txtResult)
    btnGnerate.setOnClickListerner {
        val age = ageNumber.text.toString().toIntOrNull()
        if (age != null) {
            val result = when (age) {
                in 0..12 -> "Child"
                in 13..19 -> "Teenager"
                in 20..59 -> "Adult"
                else -> "Senior"

            }
            txtResult.text = "Age: $age\n${
                when (result) {
                    "Child" -> "You are a child"
                    "Teenager" -> "You are a teenager"
                    "Adult" -> "You are an adult"
                    else -> "You are a senoir"
                    
        
    }
    
    
    
    
    
}