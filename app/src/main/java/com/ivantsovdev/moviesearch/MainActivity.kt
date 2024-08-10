package com.ivantsovdev.moviesearch

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun button1(view: View) {
        Toast.makeText(this, "Главная", Toast.LENGTH_SHORT).show()
    }

    fun button2(view: View) {
        Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
    }

    fun button3(view: View) {
        Toast.makeText(this, "Фильмы", Toast.LENGTH_SHORT).show()
    }

    fun button4(view: View) {
        Toast.makeText(this, "Сериалы", Toast.LENGTH_SHORT).show()
    }

    fun button5(view: View) {
        Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
    }


}