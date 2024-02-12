package com.example.next_and_previous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity(){
    lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@FifthActivity,SixthActivity::class.java)
            startActivity(intent)
        }
        binding.previousBtn.setOnClickListener {
            finish()
        }

    }
}