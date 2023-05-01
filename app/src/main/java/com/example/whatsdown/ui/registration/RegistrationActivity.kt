package com.example.whatsdown.ui.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsdown.R
import com.example.whatsdown.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_registration)

    }
}