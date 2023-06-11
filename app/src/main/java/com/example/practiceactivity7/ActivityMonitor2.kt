package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityMonitor2Binding

class ActivityMonitor2 : AppCompatActivity() {
    private lateinit var binding: ActivityMonitor2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMonitor2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}