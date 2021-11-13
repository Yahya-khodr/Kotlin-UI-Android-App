package com.example.kotlin_ui_android_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kotlin_ui_android_app.adapter.CardItemAdapter
import com.example.kotlin_ui_android_app.adapter.LangAdapter
import com.example.kotlin_ui_android_app.databinding.ActivityCategoryBinding
import com.example.kotlin_ui_android_app.databinding.CategoryCardBinding
import com.example.kotlin_ui_android_app.model.CardItem
import com.example.kotlin_ui_android_app.model.Language


class CategoryActivity : AppCompatActivity() {

    private var _binding: ActivityCategoryBinding? = null
    private val binding get() = _binding
    private lateinit var cardItemAdapter: CardItemAdapter
    private lateinit var cardList: List<CardItem>
    private lateinit var langAdapter: LangAdapter
    private lateinit var langList: List<Language>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        loadItem()
        loadLang()
        loadImage()

        cardItemAdapter = CardItemAdapter(cardList)
        langAdapter = LangAdapter(langList)
        binding?.rvCard?.adapter = cardItemAdapter
        binding?.rvLang?.adapter = langAdapter

    }

    private fun loadImage() {
        val options: RequestOptions = RequestOptions()
            .centerCrop()
        binding?.ivCategoryDetail.let {
            if (it != null) {
                Glide.with(this).load("https://images.unsplash.com/photo-1498050108023-c5249f4df085")
                    .apply(options).into(
                        it
                    )
            }
        }

    }


    private fun loadItem() {
        cardList = listOf(
            CardItem(
                "Angler - The Complete Guide",
                "50 lectures",
                "80 hr",
                "4.8",
                "22,300"
            ),
            CardItem(
                "Angler - The Complete Guide",
                "50 lectures",
                "80 hr",
                "4.8",
                "22,300"
            ),
            CardItem(
                "Angler - The Complete Guide",
                "50 lectures",
                "80 hr",
                "4.8",
                "22,300"
            ),
            CardItem(
                "Angler - The Complete Guide",
                "50 lectures",
                "80 hr",
                "4.8",
                "22,300"
            ),
        )
    }

    private fun loadLang() {
        langList = listOf(
            Language(
                "React"
            ),
            Language(
                "JavaScript"
            ),
            Language(
                "Kotlin"
            ),
            Language(
                "Angular"
            ),
            Language(
                "Angular"
            ),
            Language(
                "Angular"
            ),
        )

    }
}