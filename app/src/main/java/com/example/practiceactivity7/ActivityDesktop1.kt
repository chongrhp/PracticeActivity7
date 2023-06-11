package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityDesktop1Binding

class ActivityDesktop1 : AppCompatActivity() {
    private lateinit var binding : ActivityDesktop1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesktop1Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}