package com.example.practiceactivity7

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityLaptop1Binding

class ActivityLaptop1 : AppCompatActivity() {
    private lateinit var binding : ActivityLaptop1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaptop1Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}