package com.example.practiceactivity7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityComputerListBinding
import com.example.practiceactivity7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLaptop.setOnClickListener {
            val myIntent = Intent(this, ComputerActivityList::class.java)
            startActivity(myIntent)
        }

        binding.btnDesktop.setOnClickListener {
            val myIntent = Intent(this, ComputerDesktopActivity::class.java)
            startActivity(myIntent)
        }

        binding.btnMonitor.setOnClickListener {
            val myIntent = Intent(this, ComputerMonitorActivity::class.java)
            startActivity(myIntent)
        }

        binding.btnCCTV.setOnClickListener {
            val myIntent = Intent(this, CCTVActivity::class.java)
            startActivity(myIntent)
        }

        binding.btnSoftware.setOnClickListener {
            val myIntent = Intent(this, ComputerSoftwareActivity::class.java)
            startActivity(myIntent)
        }
    }


}