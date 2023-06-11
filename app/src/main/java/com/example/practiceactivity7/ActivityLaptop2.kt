package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityLaptop2Binding

class ActivityLaptop2 : AppCompatActivity() {
    private lateinit var binding: ActivityLaptop2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaptop2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}