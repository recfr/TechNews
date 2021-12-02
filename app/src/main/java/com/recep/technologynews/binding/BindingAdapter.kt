package com.recep.technologynews.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("thumbnail")
fun bindThumbnails(view: ImageView, media: String) {
    Glide.with(view.context).load(media).into(view)
}