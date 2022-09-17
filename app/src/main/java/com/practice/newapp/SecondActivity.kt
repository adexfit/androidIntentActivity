package com.practice.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.practice.newapp.MainActivity.Companion.REPLY
import com.practice.newapp.MainActivity.Companion.USER
import com.practice.newapp.databinding.ActivityMainBinding
import com.practice.newapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userName = intent.getStringExtra(USER)

        if (userName?.isNotEmpty() == true) binding.tvSecondHeader.text = userName

        binding.btnSubmitActivity2.setOnClickListener {
            var message = binding.etReply2.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(REPLY, message)
            startActivity(intent)
        }
    }
}