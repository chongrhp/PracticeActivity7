package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivitySoftware1Binding

class ActivitySoftware1 : AppCompatActivity() {
    private lateinit var binding: ActivitySoftware1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoftware1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}