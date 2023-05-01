package com.example.whatsdown.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsdown.R
import com.example.whatsdown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    //RegistrationActivity (PhoneNumberFragment, SignUpFragment, LoginFragment, ForgotPasswordFragment)
    //SocialActivity (HomeFragment, ChatFragment)
    //UserSettingsActivity (
}