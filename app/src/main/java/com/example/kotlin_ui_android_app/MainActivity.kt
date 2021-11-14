package com.example.kotlin_ui_android_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.kotlin_ui_android_app.adapter.CategoryAdapter
import com.example.kotlin_ui_android_app.adapter.CourseAdapter
import com.example.kotlin_ui_android_app.databinding.ActivityMainBinding
import com.example.kotlin_ui_android_app.model.Category
import com.example.kotlin_ui_android_app.model.Course

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryList: List<Category>
    private lateinit var courseAdapter: CourseAdapter
    private lateinit var courseList: List<Course>
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        loadCategory()
        loadCourse()
        categoryAdapter = CategoryAdapter(categoryList)
        courseAdapter = CourseAdapter(courseList)
        binding?.rvRcd?.adapter = courseAdapter
        binding?.rvCat?.adapter = categoryAdapter

    }


    private fun loadCategory() {
        categoryList = listOf(
            Category(
                "Development",
                "165 courses",
                R.drawable.development_image
            ),
            Category(
                "Design",
                "165 courses",
                R.drawable.development_image
            ),
            Category(
                "Development",
                "165 courses",
                R.drawable.development_image
            ),
            Category(
                "Development",
                "165 courses",
                R.drawable.development_image
            ),
            Category(
                "Development",
                "165 courses",
                R.drawable.development_image
            )
        )
    }

    private fun loadCourse() {
        courseList = listOf(
            Course(
                "IELTS Preparation",
                "Teaching & Academics",
                "4.9",
                "86 hours"
            ),
            Course(
                "IELTS Preparation",
                "Teaching & Academics",
                "4.9",
                "86 hours"
            ),
            Course(
                "IELTS Preparation",
                "Teaching & Academics",
                "4.9",
                "86 hours"
            ),
            Course(
                "IELTS Preparation",
                "Teaching & Academics",
                "4.9",
                "86 hours"
            ),
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}


