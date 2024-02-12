package com.example.next_and_previous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivityNinthBinding

class NinthActivity : AppCompatActivity() {

    lateinit var binding: ActivityNinthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNinthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@NinthActivity,TenthActivity::class.java)
            startActivity(intent)
        }
        binding.previousBtn.setOnClickListener {
            finish()
        }
    }
}