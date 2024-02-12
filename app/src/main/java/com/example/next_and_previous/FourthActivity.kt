package com.example.next_and_previous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {

    lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@FourthActivity,FifthActivity::class.java)
            startActivity(intent)
        }
        binding.previousBtn.setOnClickListener {
            finish()
        }
    }


}