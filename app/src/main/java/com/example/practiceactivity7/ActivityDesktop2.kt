package com.example.practiceactivity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity7.databinding.ActivityDesktop2Binding

class ActivityDesktop2 : AppCompatActivity() {
    private lateinit var bind : ActivityDesktop2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDesktop2Binding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}