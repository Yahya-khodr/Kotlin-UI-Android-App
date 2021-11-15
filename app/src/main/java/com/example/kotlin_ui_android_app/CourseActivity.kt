package com.example.kotlin_ui_android_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_ui_android_app.adapter.LessonAdapter
import com.example.kotlin_ui_android_app.databinding.ActivityCourseBinding
import com.example.kotlin_ui_android_app.model.Lesson

class CourseActivity : AppCompatActivity() {

    private var _binding: ActivityCourseBinding? = null
    private val binding get() = _binding
    private lateinit var lessonAdapter: LessonAdapter
    private lateinit var lessonList: List<Lesson>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCourseBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        loadLesson()

        lessonAdapter = LessonAdapter(lessonList)
        binding?.rvLesson?.adapter = lessonAdapter
    }

    private fun loadLesson() {
        lessonList = listOf(
            Lesson(
                "Getting Started",
                "12 lectures",
                "42 min"
            ),
            Lesson(
                "The Basics",
                "42 lectures",
                "1hr 42 min"
            ),
            Lesson(
                "Getting Started",
                "12 lectures",
                "42 min"
            ),
            Lesson(
                "The Basics",
                "42 lectures",
                "1hr 42 min"
            ),
            Lesson(
                "Getting Started",
                "12 lectures",
                "42 min"
            ),
            Lesson(
                "The Basics",
                "42 lectures",
                "1hr 42 min"
            ),
        )
    }
}