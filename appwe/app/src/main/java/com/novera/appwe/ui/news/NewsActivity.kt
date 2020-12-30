package com.novera.appwe.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novera.appwe.R

class NewsActivity : AppCompatActivity() {
    companion object{
        const val OPEN_NEWS = "open_news"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}