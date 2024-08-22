package com.ivantsovdev.moviesearch

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ivantsovdev.moviesearch.databinding.FragmentDetailsBinding


@SuppressLint("StaticFieldLeak")
private var binding: FragmentDetailsBinding? = null


class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFilmsDetails()
    }

    private fun setFilmsDetails() {
        val film = arguments?.get("film") as Film
        binding?.detailsToolbar?.title = film.title
        binding?.detailsPoster?.setImageResource(film.poster)
        binding?.detailsDescription?.text = film.description
    }

}