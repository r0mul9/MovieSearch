package com.ivantsovdev.moviesearch

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.ivantsovdev.moviesearch.databinding.FilmItemBinding

class FilmListRecyclerAdapter(private val clickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val items = mutableListOf<MainActivity.Film>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FilmItemBinding.inflate(inflater, parent, false)
        return FilmViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FilmViewHolder -> {
                holder.bind(items[position])
                holder.itemView.setOnClickListener {
                    clickListener.click(items[position])
                }
            }
        }
    }

    fun addItems(list: List<MainActivity.Film>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun click(film: MainActivity.Film)
    }

}