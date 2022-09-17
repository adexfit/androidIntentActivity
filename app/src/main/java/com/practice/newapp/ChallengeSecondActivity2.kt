package com.practice.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice.newapp.databinding.ActivityChallengeSecond2Binding
import com.practice.newapp.databinding.ActivitySecondBinding

class ChallengeSecondActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityChallengeSecond2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChallengeSecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val ourPassage = intent.getStringExtra("PASSAGE")
        //val userName = intent.getStringExtra("USER")

        binding.tvParagraph.text = ourPassage



    }
}

