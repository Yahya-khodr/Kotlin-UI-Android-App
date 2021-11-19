package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.R
import com.example.kotlin_ui_android_app.databinding.LayoutRecyclerItemBinding
import com.example.kotlin_ui_android_app.model.Category
import com.example.kotlin_ui_android_app.model.Course
import com.example.kotlin_ui_android_app.model.ItemModel

class ItemRecyclerAdapter(private val itemModelList: List<ItemModel>) :
    RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder>() {
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var courseAdapter: CourseAdapter


    inner class ItemViewHolder(
        private val itemBinding: LayoutRecyclerItemBinding,

        ) : RecyclerView.ViewHolder(itemBinding.root) {


        fun bind(model: ItemModel) {
            itemBinding.tvItemTitle.text = model.itemTitle
            if (itemBinding.tvItemTitle.text == "Categories"){
                categoryAdapter = CategoryAdapter(model.category)
                itemBinding.rvItem.adapter = categoryAdapter

            }
            if (itemBinding.tvItemTitle.text == "Recommended"){
                courseAdapter = CourseAdapter(model.course)
                itemBinding.rvItem.adapter = courseAdapter
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding =
            LayoutRecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemModelList[position])

    }

    override fun getItemCount(): Int {
        return itemModelList.size
    }

}


