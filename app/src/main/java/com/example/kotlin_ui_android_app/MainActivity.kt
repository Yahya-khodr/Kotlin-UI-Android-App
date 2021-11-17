package com.example.kotlin_ui_android_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.adapter.CategoryAdapter
import com.example.kotlin_ui_android_app.adapter.CourseAdapter
import com.example.kotlin_ui_android_app.adapter.ItemRecyclerAdapter
import com.example.kotlin_ui_android_app.databinding.ActivityMainBinding
import com.example.kotlin_ui_android_app.model.Category
import com.example.kotlin_ui_android_app.model.Course
import com.example.kotlin_ui_android_app.model.ItemModel

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    private lateinit var categoryList: List<Category>
    private lateinit var itemList: List<ItemModel>
    private lateinit var itemRecyclerAdapter: ItemRecyclerAdapter
    private lateinit var courseList: List<Course>
    private lateinit var itemRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setAdapter()


    }



    private fun setAdapter() {
        loadItem()
        initAdapter()

    }

    private fun initAdapter() {
        itemRecyclerView = findViewById(R.id.Parent_recyclerView)
        itemRecyclerAdapter = ItemRecyclerAdapter(itemList)
        binding?.layoutCategory?.ParentRecyclerView?.adapter = itemRecyclerAdapter

    }

    private fun loadItem() {
        itemList = listOf(
            ItemModel("Categories"), ItemModel("Recommended")

        )
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


