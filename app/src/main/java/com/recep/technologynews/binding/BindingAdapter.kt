package com.recep.technologynews.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("thumbnail")
fun bindThumbnails(view: ImageView, mediaResource: Int) {
    view.setImageResource(mediaResource)
}