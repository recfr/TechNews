package com.recep.technologynews.recyclerview

import android.os.Bundle
import android.util.Log
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
        Log.i("itemClick", model[adapterPosition].title)

        val bundle = Bundle()
        bundle.putString("title", model[adapterPosition].title)

        itemView.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
    }

    fun bind(new: NewsModel) {
        binding.news = new
    }




}
