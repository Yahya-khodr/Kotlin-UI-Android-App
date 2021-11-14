package com.example.kotlin_ui_android_app.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.CourseActivity
import com.example.kotlin_ui_android_app.databinding.RecommendedCardBinding
import com.example.kotlin_ui_android_app.model.Course

class CourseAdapter(private val courseList: List<Course>) :
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {


    inner class CourseViewHolder(private val binding: RecommendedCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: Course) {
            binding.tvRate.text = model.rate
            binding.tvTitle.text = model.title
            binding.tvType.text = model.type
            binding.tvDuration.text = model.duration
            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context,CourseActivity::class.java)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val binding =
            RecommendedCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
       holder.bind(courseList[position])

    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}