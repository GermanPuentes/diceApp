package com.gerappdev.diceapp

import Mundo.dados
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gerappdev.diceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLanzarMain.setOnClickListener {
            binding.imgDado1Main.setImageResource(dados().darDado())
            binding.imgDado2Main.setImageResource(dados().darDado())
        }
    }
}