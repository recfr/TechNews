package com.recep.technologynews.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("thumbnail")
fun bindThumbnails(view: ImageView, mediaResource: Int) {
    view.setImageResource(mediaResource)
}