package com.recep.technologynews.recyclerview

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.recep.technologynews.databinding.AdapterItemNewsPosterBinding
import com.recep.technologynews.model.NewsModel


class NewsViewHolder(
    private val binding: AdapterItemNewsPosterBinding,
    model: List<NewsModel>,
) : RecyclerView.ViewHolder(binding.root) {

    init {
        itemView.setOnClickListener{
            navigateToDetails(model)
        }
    }

    private fun navigateToDetails(model: List<NewsModel>) {
        Log.i("itemClick", model[adapterPosition].title)

//       Navigate to Detail Fragment with arguments: News(image_id, title, details)

    }

    fun bind(new: NewsModel) {
        binding.news = new
    }
}
