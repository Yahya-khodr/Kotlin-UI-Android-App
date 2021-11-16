package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.databinding.LayoutRecyclerBinding
import com.example.kotlin_ui_android_app.model.Category
import com.example.kotlin_ui_android_app.model.Course
import com.example.kotlin_ui_android_app.model.ItemModel

class ItemRecyclerAdapter(
    private val itemList: List<ItemModel>,




    ) : RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder>() {
    private val recyclerView: RecyclerView? =null
    private val categoryList: List<Category> = emptyList()
    private val courseList: List<Course> = emptyList()


    inner class ItemViewHolder(private val itemBinding: LayoutRecyclerBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(model: ItemModel) {
            itemBinding.tvItemTitle.text = model.itemTitle
        }

        fun setList(recyclerView: RecyclerView, position: Int) {
            when (position) {
                0 -> setCategoryList(recyclerView)
                1 -> setRecommendedList(recyclerView)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemBinding =
            LayoutRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemBinding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
        if (recyclerView != null) {
            holder.setList(recyclerView, position)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setCategoryList(recyclerView: RecyclerView) {
        val categoryAdapter = CategoryAdapter(categoryList)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = categoryAdapter


    }

    fun setRecommendedList(recyclerView: RecyclerView) {
        val courseAdapter = CourseAdapter(courseList)
        recyclerView.adapter = courseAdapter
        recyclerView.setHasFixedSize(true)
    }


}