package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityCctv1Binding

class ActivityCCTV1 : AppCompatActivity() {
    private lateinit var binding : ActivityCctv1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCctv1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}