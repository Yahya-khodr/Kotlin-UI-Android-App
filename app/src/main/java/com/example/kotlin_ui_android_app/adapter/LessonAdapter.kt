package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.databinding.LessonCardBinding
import com.example.kotlin_ui_android_app.model.Lesson

class LessonAdapter(private val lessonList: List<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {
    inner class LessonViewHolder(private val binding: LessonCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Lesson) {
            binding.tvLessonTitle.text = model.title
            binding.tvLessonNum.text = model.lectureNum
            binding.tvLessonTime.text = model.duration
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val binding = LessonCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(lessonList[position])
    }

    override fun getItemCount(): Int {
        return lessonList.size
    }
}