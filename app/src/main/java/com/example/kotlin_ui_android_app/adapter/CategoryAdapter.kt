package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.TransformationUtils.centerCrop
import com.example.kotlin_ui_android_app.databinding.CategoryCardBinding
import com.example.kotlin_ui_android_app.model.Category


class CategoryAdapter(private val categoryList: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


    inner class CategoryViewHolder(private val binding: CategoryCardBinding) :
        RecyclerView.ViewHolder(binding.root){
            fun bind(model: Category){
                binding.tvCourseNum.text= model.course_number
                binding.tvTitle.text= model.title
                Glide.with(binding.root)

                    .load(model.imageUrl)
                    .centerCrop()
                    .override(300,200)
                    .into(binding.ivCategory)
            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryCardBinding =
            CategoryCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(categoryCardBinding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
    holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int =
        categoryList.size

}

