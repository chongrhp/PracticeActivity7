package com.example.practiceactivity7

import android.app.Instrumentation.ActivityMonitor
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.practiceactivity7.databinding.ActivityComputerMonitorBinding

class ComputerMonitorActivity : AppCompatActivity() {
    private lateinit var binding : ActivityComputerMonitorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerMonitorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val monitor1:String = "<b>Php 15,472.20<br/></br>nAOC AG275QXL 27-inch</b> QHD IPS LED 170Hz Gsync Gaming Monitor"
        val monitor2:String = "<b>Php 15,472.20<br/></br>N-Vision V200H 20.0-inch</b> LED Monitor"

        binding.txtMonitor1.setText(Html.fromHtml(monitor1))
        binding.txtMonitor2.setText(Html.fromHtml(monitor2))

        binding.btnMonitor1.setOnClickListener {
            val myIntent = Intent(this, ActivityMonitor1::class.java )
            startActivity(myIntent)
        }

        binding.btnImage1.setOnClickListener {
            val myIntent = Intent(this, ActivityMonitor1::class.java )
            startActivity(myIntent)
        }

        binding.btnMonitor2.setOnClickListener {
            val myIntent = Intent(this, ActivityMonitor2::class.java)
            startActivity(myIntent)
        }

        binding.btnImage2.setOnClickListener {
            val myIntent = Intent(this, ActivityMonitor2::class.java)
            startActivity(myIntent)
        }
    }
}