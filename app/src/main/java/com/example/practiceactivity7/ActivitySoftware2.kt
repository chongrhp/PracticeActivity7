package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivitySoftware2Binding

class ActivitySoftware2 : AppCompatActivity() {
    private lateinit var binding: ActivitySoftware2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoftware2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}