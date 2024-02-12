package com.example.next_and_previous

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.next_and_previous.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}