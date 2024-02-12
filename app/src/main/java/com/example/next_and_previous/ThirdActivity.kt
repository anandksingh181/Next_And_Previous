package com.example.next_and_previous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.next_and_previous.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@ThirdActivity,FourthActivity::class.java)
            startActivity(intent)
        }
        binding.previousBtn.setOnClickListener {
            finish()
        }
    }
}