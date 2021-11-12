package com.example.kotlin_ui_android_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_ui_android_app.adapter.CategoryAdapter
import com.example.kotlin_ui_android_app.databinding.ActivityMainBinding
import com.example.kotlin_ui_android_app.model.Category

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryList: List<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        loadCategory()
        categoryAdapter = CategoryAdapter(categoryList)
        binding?.rvCat?.adapter = categoryAdapter

    }

    private fun loadCategory(){
        categoryList = listOf(
            Category(
                "Development",
                "165 courses",
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085"
            ),
            Category(
                "Development",
                "165 courses",
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085"
            ),
            Category(
                "Development",
                "165 courses",
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085"
            ),
            Category(
                "Development",
                "165 courses",
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085"
            ),
            Category(
                "Development",
                "165 courses",
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085"
            )
        )
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}