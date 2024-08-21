package com.ivantsovdev.moviesearch

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.versionedparcelable.VersionedParcelize
import com.ivantsovdev.moviesearch.databinding.ActivityMainBinding
import kotlinx.parcelize.Parcelize


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }

        binding.bottomNavigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Смотреть позже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        binding.mainRecycler.apply {
            filmsAdapter = FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener{

                override fun click(film: Film) {
                    val bundle = Bundle()
                    bundle.putParcelable("film", film)
                    val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            })

            adapter = filmsAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
        filmsAdapter.addItems(filmsDataBase)
    }
@Parcelize
    data class Film(
        val title: String,
        val poster: Int,
        val description: String
    ) : Parcelable
    val filmsDataBase = listOf(
        Film("Deadpool & Wolverine", R.drawable.deadpool_wolverine, "Deadpool is offered a place in the Marvel Cinematic Universe by the Time Variance Authority, but instead recruits a variant of Wolverine to save his universe from extinction."),
        Film("Alien: Romulus", R.drawable.alien_romulus, "While scavenging the deep ends of a derelict space station, a group of young space colonists come face to face with the most terrifying life form in the universe."),
        Film("Borderlands", R.drawable.borderlands, "Based on the best-selling videogame, this all-star action-adventure follows a ragtag team of misfits on a mission to save a missing girl who holds the key to unimaginable power."),
        Film("Kingdom of the Planet of the Apes", R.drawable.kingdom_of_the_planet_of_the_apes, "Many years after the reign of Caesar, a young ape goes on a journey that will lead him to question everything he's been taught about the past and make choices that will define a future for apes and humans alike."),
        Film("Kingsman: The Secret Service", R.drawable.kingsman_the_secret_service, "A spy organisation recruits a promising street kid into the agency's training program, while a global threat emerges from a twisted tech genius."),
        Film("The Fall Guy", R.drawable.the_fall_guy, "A stuntman, fresh off an almost career-ending accident, has to track down a missing movie star, solve a conspiracy and try to win back the love of his life while still doing his day job. What could possibly go right?"),
        Film("Oppenheimer", R.drawable.oppenheimer, "The story of American scientist J. Robert Oppenheimer and his role in the development of the atomic bomb."),
        Film("Challengers", R.drawable.challengers, "Tasha, a former tennis prodigy turned coach, transformed her husband into a champion. But to overcome a recent losing streak and redeem himself, he'll need to face off against his former best friend, and Tasha's ex-boyfriend."),
        Film("X-Men", R.drawable.x_men, "In a world where mutants (evolved super-powered humans) exist and are discriminated against, two groups form for an inevitable clash: the supremacist Brotherhood, and the pacifist X-Men."),
        Film("Interstellar", R.drawable.interstellar, "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans."),

    )

    private lateinit var filmsAdapter: FilmListRecyclerAdapter

}

