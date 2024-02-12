package com.example.next_and_previous

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivityTenthBinding

class TenthActivity : AppCompatActivity() {

    lateinit var binding: ActivityTenthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTenthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.previousBtn.setOnClickListener {
            finish()
        }
    }
}