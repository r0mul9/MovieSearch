package com.ivantsovdev.moviesearch.data

import com.ivantsovdev.moviesearch.R
import com.ivantsovdev.moviesearch.domain.Film

class MainRepository {
     val filmsDataBase = listOf(
        Film(
            "Deadpool & Wolverine",
            R.drawable.deadpool_wolverine,
            "Deadpool is offered a place in the Marvel Cinematic Universe by the Time Variance Authority, but instead recruits a variant of Wolverine to save his universe from extinction.", 8f
        ),
        Film(
            "Alien: Romulus",
            R.drawable.alien_romulus,
            "While scavenging the deep ends of a derelict space station, a group of young space colonists come face to face with the most terrifying life form in the universe.", 5f
        ),
        Film(
            "Borderlands",
            R.drawable.borderlands,
            "Based on the best-selling videogame, this all-star action-adventure follows a ragtag team of misfits on a mission to save a missing girl who holds the key to unimaginable power.", 6f
        ),
        Film(
            "Kingdom of the Planet of the Apes",
            R.drawable.kingdom_of_the_planet_of_the_apes,
            "Many years after the reign of Caesar, a young ape goes on a journey that will lead him to question everything he's been taught about the past and make choices that will define a future for apes and humans alike.", 8f
        ),
        Film(
            "Kingsman: The Secret Service",
            R.drawable.kingsman_the_secret_service,
            "A spy organisation recruits a promising street kid into the agency's training program, while a global threat emerges from a twisted tech genius.", 9f
        ),
        Film(
            "The Fall Guy",
            R.drawable.the_fall_guy,
            "A stuntman, fresh off an almost career-ending accident, has to track down a missing movie star, solve a conspiracy and try to win back the love of his life while still doing his day job. What could possibly go right?", 4f
        ),
        Film(
            "Oppenheimer",
            R.drawable.oppenheimer,
            "The story of American scientist J. Robert Oppenheimer and his role in the development of the atomic bomb.", 6f
        ),
        Film(
            "Challengers",
            R.drawable.challengers,
            "Tasha, a former tennis prodigy turned coach, transformed her husband into a champion. But to overcome a recent losing streak and redeem himself, he'll need to face off against his former best friend, and Tasha's ex-boyfriend.", 9f
        ),
        Film(
            "X-Men",
            R.drawable.x_men,
            "In a world where mutants (evolved super-powered humans) exist and are discriminated against, two groups form for an inevitable clash: the supremacist Brotherhood, and the pacifist X-Men.", 10f
        ),
        Film(
            "Interstellar",
            R.drawable.interstellar,
            "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.", 9f
        ),

        )
}