package com.example.kotlin_ui_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_ui_android_app.databinding.CategoryCardBinding

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: CategoryCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = CategoryCardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val intent = intent
    }
}