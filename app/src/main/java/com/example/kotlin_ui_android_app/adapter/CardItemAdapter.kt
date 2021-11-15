package com.example.kotlin_ui_android_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.databinding.CardItemBinding
import com.example.kotlin_ui_android_app.model.CardItem

class CardItemAdapter(private val cardList: List<CardItem>) : RecyclerView.Adapter<CardItemAdapter.CardItemViewHolder>() {


    inner class CardItemViewHolder(private val binding: CardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun  bind(model:CardItem){
                binding.tvCardTitle.text = model.title
                binding.tvLecture.text = model.lecture
                binding.tvStar.text = model.rate
                binding.tvTime.text = model.duration
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardItemViewHolder {
        val binding = CardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return CardItemViewHolder(binding)

    }

    override fun onBindViewHolder(holder: CardItemViewHolder, position: Int) {
       holder.bind(cardList[position])
    }

    override fun getItemCount(): Int {
        return cardList.size
    }
}