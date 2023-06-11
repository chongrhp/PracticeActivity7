package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityMonitor1Binding

class ActivityMonitor1 : AppCompatActivity() {
    private lateinit var binding : ActivityMonitor1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonitor1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}