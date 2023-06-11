package com.example.practiceactivity7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.practiceactivity7.databinding.ActivityComputerSoftwareBinding

class ComputerSoftwareActivity : AppCompatActivity() {
    private lateinit var binding : ActivityComputerSoftwareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerSoftwareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.txtDesktop1.setText(Html.fromHtml(desktop1))
        val software1:String = "<b>Php 5,472.20<br/></br>Kaspersky Internet Security 2021</b>[ 1 Device / User ]"
        val software2:String = "<b>Php 10,600.00<br/><br/>Microsoft Windows 11 Home</b> 32/64Bit FPP (Full Package Product)"


        binding.txtSoftware1.setText(Html.fromHtml(software1))
        binding.txtSoftware2.setText(Html.fromHtml(software2))

        binding.btnSoftware1.setOnClickListener {
            val myIntent = Intent(this, ActivitySoftware1::class.java)
            startActivity(myIntent)
        }

        binding.btnImage1.setOnClickListener {
            val myIntent = Intent(this, ActivitySoftware1::class.java)
            startActivity(myIntent)
        }

        binding.btnSoftware2.setOnClickListener {
            val myIntent = Intent(this, ActivitySoftware2::class.java)
            startActivity(myIntent)
        }

        binding.btnImage2.setOnClickListener {
            val myIntent = Intent(this, ActivitySoftware2::class.java)
            startActivity(myIntent)

        }
    }
}