package com.ivantsovdev.moviesearch


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ivantsovdev.moviesearch.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var film: Film
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFilmsDetails()

        binding.detailsFabFavorites.setOnClickListener {

            if (!film.isInFavorites) {
                binding.detailsFabFavorites.setImageResource(R.drawable.baseline_favorite_24)
                film.isInFavorites = true
            } else {
                binding.detailsFabFavorites.setImageResource(R.drawable.baseline_favorite_border_24)
                film.isInFavorites = false
            }
        }
        binding.detailsFab.setOnClickListener {
            //Создаем интент
            val intent = Intent()
            //Укзываем action с которым он запускается
            intent.action = Intent.ACTION_SEND
            //Кладем данные о нашем фильме
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "Check out this film: ${film.title} \n\n ${film.description}"
            )
            //УКазываем MIME тип, чтобы система знала, какое приложения предложить
            intent.type = "text/plain"
            //Запускаем наше активити
            startActivity(Intent.createChooser(intent, "Share To:"))
        }
    }


    private fun setFilmsDetails() {
        val film = arguments?.get("film") as Film
        binding.detailsToolbar.title = film.title
        binding.detailsPoster.setImageResource(film.poster)
        binding.detailsDescription.text = film.description

        binding.detailsFabFavorites.setImageResource(
            if (film.isInFavorites) R.drawable.baseline_favorite_24
            else R.drawable.baseline_favorite_border_24
        )
    }


}