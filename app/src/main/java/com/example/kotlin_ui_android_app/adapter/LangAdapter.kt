package com.example.kotlin_ui_android_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_ui_android_app.databinding.LanguageCardBinding
import com.example.kotlin_ui_android_app.model.Language

class LangAdapter(private val langList: List<Language>) :
    RecyclerView.Adapter<LangAdapter.LangViewHolder>() {

    inner class LangViewHolder(private val binding: LanguageCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model:Language){
            binding.tvLang.text = model.lang
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangViewHolder {
        val binding = LanguageCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LangViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LangViewHolder, position: Int) {
        holder.bind(langList[position])
    }

    override fun getItemCount(): Int {
        return langList.size
    }
}