package com.example.kotlin_ui_android_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin_ui_android_app.model.Category

class CategoryViewModel {
    private val categoryMutableLiveData = MutableLiveData<List<Category>>()

    val categoryLiveData: LiveData<List<Category>> = categoryMutableLiveData
}