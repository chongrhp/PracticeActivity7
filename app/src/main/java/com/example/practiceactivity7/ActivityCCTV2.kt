package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityCctv2Binding

class ActivityCCTV2 : AppCompatActivity() {
    private lateinit var binding : ActivityCctv2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCctv2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}