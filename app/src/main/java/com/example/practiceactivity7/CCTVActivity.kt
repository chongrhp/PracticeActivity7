package com.example.practiceactivity7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.practiceactivity7.databinding.ActivityCctvactivityBinding

class CCTVActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCctvactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCctvactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cctv1:String = "<b>Php 4,472.20<br/><br/>AOC AG275QXL 27-inch</b> QHD IPS LED 170Hz Gsync Gaming Monitor"
        val cctv2:String = "<b>Php 15,472.20<br/></br>N-Vision V200H 20.0-inch</b> LED Monitor"

        binding.txtCCTV1.setText(Html.fromHtml(cctv1))
        binding.txtCCTV2.setText(Html.fromHtml(cctv2))

        binding.btnCCTV1.setOnClickListener {
            val myIntent = Intent(this, ActivityCCTV1::class.java )
            startActivity(myIntent)
        }

        binding.btnImage1.setOnClickListener {
            val myIntent = Intent(this, ActivityCCTV1::class.java )
            startActivity(myIntent)
        }

        binding.btnCCTV2.setOnClickListener {
            val myIntent = Intent(this, ActivityCCTV2::class.java)
            startActivity(myIntent)
        }

        binding.btnImage2.setOnClickListener {
            val myIntent = Intent(this, ActivityCCTV2::class.java)
            startActivity(myIntent)
        }
    }

}