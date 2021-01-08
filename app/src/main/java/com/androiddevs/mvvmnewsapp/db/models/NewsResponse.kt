package com.androiddevs.mvvmnewsapp.db.models

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)