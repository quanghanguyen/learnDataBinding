package com.example.learndatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.learndatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnEnter.setOnClickListener {
            val NumA = binding.edtNumber1.text.toString().toInt()
            val NumB = binding.edtNumber2.text.toString().toInt()

            binding.sum = NumA + NumB
        }
    }
}