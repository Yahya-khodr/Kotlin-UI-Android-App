package com.example.kotlin_ui_android_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    private lateinit var itemList: List<ItemModel>
    private lateinit var itemRecyclerAdapter: ItemRecyclerAdapter
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var courseAdapter: CourseAdapter

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

        itemRecyclerAdapter = ItemRecyclerAdapter(itemList)
        binding?.layoutCategory?.ParentRecyclerView?.adapter = itemRecyclerAdapter

    }

    private fun loadItem() {

        val categoryList = arrayListOf<Category>()
        categoryAdapter = CategoryAdapter(categoryList)
        categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
        categoryList.add(Category("Design", "150 courses", R.drawable.development_image))
        categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
        categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
        categoryList.add(Category("Development", "160 courses", R.drawable.development_image))


        val courseList = arrayListOf<Course>()
        courseAdapter = CourseAdapter(courseList)
        courseList.add(Course("IELTS Preparation", "Teaching & Academics", "4.9", "86 hours"))
        courseList.add(Course("IELTS Preparation", "Teaching & Academics", "4.9", "86 hours"))
        courseList.add(Course("IELTS Preparation", "Teaching & Academics", "4.9", "86 hours"))
        courseList.add(Course("IELTS Preparation", "Teaching & Academics", "4.9", "86 hours"))
        courseList.add(Course("IELTS Preparation", "Teaching & Academics", "4.9", "86 hours"))

        itemList = listOf(
            ItemModel("Categories", categoryList, courseList),
            ItemModel("Recommended", categoryList, courseList)

        )
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}


