package com.practice.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import android.widget.Toast.*
import com.practice.newapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val REPLY = "REPLY"
        const val USER = "USER"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val reply2Activity = intent.getStringExtra(REPLY)

        setContentView(binding.root)
            var enteredName = ""

            binding.btnProceed.visibility = INVISIBLE
            binding.btnSubmit.setOnClickListener {
                enteredName = binding.editTextTextPersonName.text.toString()
                if (enteredName == ""){
                    makeText(
                        this@MainActivity,
                        "Please, enter your name",
                        LENGTH_SHORT
                        ).show()
                    binding.btnProceed.visibility = INVISIBLE
                } else {
                    val message = "Welcome $enteredName"
                    binding.tvHello.text = message
                    binding.editTextTextPersonName.text.clear()
                    binding.btnProceed.visibility = VISIBLE

                }
            }
        if (reply2Activity?.isNotEmpty() == true ){
            val message2 = "Welcome $reply2Activity"
            binding.tvHello.text = message2
        }


        binding.btnProceed.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(USER, enteredName)
            startActivity(intent)
        }

        binding.btnChallenge.setOnClickListener {
            val intent = Intent(this, ChallengeActivity::class.java)
            startActivity(intent)
        }

    }
}