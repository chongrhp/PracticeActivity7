package com.example.practiceactivity7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.practiceactivity7.databinding.ActivityComputerDesktopBinding

class ComputerDesktopActivity : AppCompatActivity() {
    private lateinit var binding : ActivityComputerDesktopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerDesktopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val desktop1: String = "<b>Php 25,472.20</b><br/><br/><b>Intel Core i5-3570 3.40GHz</b> Processor with Samsung DM300S1A SFF "+
                "Bundled with 23-inch LG Flatron 23EN43V LED Monitor with Windows 10 Microsoft Authorized Refurbisher (MAR)"

        val desktop2: String = "<b>Php 23,622.20</b><br/><br/><b>Intel Core i5-4590 3.30GHz</b> Processor with HP ProDesk 400 G1 SFF "+
                "Bundled with 23-inch Dell P2317Hb IPS-LED Full HD Monitor with Windows 10 Microsoft Authorized Refurbisher (MAR)"

        binding.txtDesktop1.setText(Html.fromHtml(desktop1))
        binding.txtDesktop2.setText(Html.fromHtml(desktop2))

        binding.btnDesktop1.setOnClickListener {
            val myInit = Intent(this, ActivityDesktop1::class.java)
            startActivity(myInit)
        }

        binding.btnImage1.setOnClickListener {
            val myInit = Intent(this, ActivityDesktop1::class.java)
            startActivity(myInit)
        }

        binding.btnDesktop2.setOnClickListener {
            val myInit = Intent(this, ActivityDesktop2::class.java)
            startActivity(myInit)
        }

        binding.btnImage2.setOnClickListener {
            val myInit = Intent(this, ActivityDesktop2::class.java)
            startActivity(myInit)
        }

    }
}