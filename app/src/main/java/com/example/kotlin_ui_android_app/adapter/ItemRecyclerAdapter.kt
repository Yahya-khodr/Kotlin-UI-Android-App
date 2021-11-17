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
    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var courseRecyclerView: RecyclerView


    inner class ItemViewHolder(
        private val itemBinding: LayoutRecyclerItemBinding,

        ) : RecyclerView.ViewHolder(itemBinding.root) {


        fun bind(model: ItemModel) {
            itemBinding.tvItemTitle.text = model.itemTitle
            categoryRecyclerView = itemBinding.rvItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            LayoutRecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemModelList[position])

        val courseList = arrayListOf<Course>()
        val categoryList = arrayListOf<Category>()
        if (itemModelList[position].itemTitle == "Categories") {
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Design", "150 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))

        }

        if (itemModelList[position].itemTitle == "Recommended") {
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Design", "150 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))
            categoryList.add(Category("Development", "160 courses", R.drawable.development_image))

        }
        categoryAdapter = CategoryAdapter(categoryList)
        categoryRecyclerView.adapter = categoryAdapter


    }

    override fun getItemCount(): Int {
        return itemModelList.size
    }


}


