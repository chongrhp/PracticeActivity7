package com.example.practiceactivity7

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.practiceactivity7.databinding.ActivityComputerListBinding
import java.io.File

class ComputerActivityList : AppCompatActivity() {
    private lateinit var binding:ActivityComputerListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val laptop1:String = "<b>Php 33,442.20<br/><br/>LG Gram 13ZD950-GX70K</b> 13.3-inch LED "+
                "Display Laptop | Intel Core i7-5500U 2.40GHz processor"
        val laptop2:String = "<b>Php 50,442.20<br/><br/>Asus ExpertBook P1 P1511CEA-BQ2128X</b> 15.6-inch LED "+
                "Display Laptop | Intel Core i7-1165G7 2.80GHz (11th Gen)"

        binding.txtLaptop1.setText(Html.fromHtml(laptop1))
        binding.txtLaptop2.setText(Html.fromHtml(laptop2))

        binding.btnLaptop1.setOnClickListener {
            val myIntent = Intent(this, ActivityLaptop1::class.java)
            startActivity(myIntent)
        }

        binding.btnImage1.setOnClickListener {
            val myIntent = Intent(this, ActivityLaptop1::class.java)
            startActivity(myIntent)
        }

        binding.btnLaptop2.setOnClickListener {
            val myIntent = Intent(this, ActivityLaptop2::class.java)
            startActivity(myIntent)
        }

        binding.btnImage2.setOnClickListener {
            val myIntent = Intent(this, ActivityLaptop2::class.java)
            startActivity(myIntent)
        }
    }
}