package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.databinding.LayoutRecyclerBinding
import com.example.kotlin_ui_android_app.model.Item
import com.example.kotlin_ui_android_app.model.ItemModel

class ItemModelAdapter(private val itemList: List<Item>) :
    RecyclerView.Adapter<ItemModelAdapter.ItemModelViewHolder>() {
    inner class ItemModelViewHolder(private val binding: LayoutRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: Item) {
            binding.tvItemTitle.text = model.itemName

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemModelViewHolder {
        val binding =
            LayoutRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemModelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemModelViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}