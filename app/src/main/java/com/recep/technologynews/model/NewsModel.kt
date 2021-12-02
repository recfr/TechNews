package com.recep.technologynews.model

data class NewsModel(
    val title: String,
    val detail: String,
    val media: Int
)

data class NewsExtra(
    val title: String,
    val detail: String,
    val detailWatch: String,
    val detailMac: String,
    val image_title: Int,
    val image_watch: Int,
    val image_mac: Int,
    val image_phone: Int
)