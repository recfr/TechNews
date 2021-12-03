package com.recep.technologynews.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recep.technologynews.databinding.AdapterItemNewsPosterBinding
import com.recep.technologynews.model.NewsModel

class NewsAdapter(private val newsList: List<NewsModel>) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterItemNewsPosterBinding.inflate(inflater, parent, false)
        return NewsViewHolder(binding, newsList)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newModel = newsList[position]
        holder.bind(newModel)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}