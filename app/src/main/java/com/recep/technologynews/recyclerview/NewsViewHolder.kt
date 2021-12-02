package com.recep.technologynews.recyclerview

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.recep.technologynews.R
import com.recep.technologynews.databinding.AdapterItemNewsPosterBinding
import com.recep.technologynews.model.NewsModel


class NewsViewHolder(
    private val binding: AdapterItemNewsPosterBinding,
    model: List<NewsModel>,
) : RecyclerView.ViewHolder(binding.root) {

    init {
        itemView.setOnClickListener{
            navigateToDetails(model, it)
        }
    }

    private fun navigateToDetails(model: List<NewsModel>, itemView: View) {
        val bundle = Bundle()
        bundle.putString("title", model[adapterPosition].title)
        bundle.putString("detail", model[adapterPosition].detail)
        bundle.putInt("media", model[adapterPosition].media)

        itemView.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
    }

    fun bind(new: NewsModel) {
        binding.news = new
    }
}
