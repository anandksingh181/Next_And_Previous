package com.example.next_and_previous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivitySeventhBinding

class SeventhActivity : AppCompatActivity() {

    lateinit var binding: ActivitySeventhBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeventhBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@SeventhActivity,EighthActivity::class.java)
            startActivity(intent)
        }
        binding.previousBtn.setOnClickListener {
            finish()
        }
    }
}