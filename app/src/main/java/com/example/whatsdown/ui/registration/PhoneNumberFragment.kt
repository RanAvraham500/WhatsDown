package com.example.whatsdown.ui.registration

import android.os.Bundle
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import com.example.whatsdown.R
import com.example.whatsdown.databinding.FragmentPhoneNumberBinding


class PhoneNumberFragment : Fragment() {
    lateinit var binding: FragmentPhoneNumberBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPhoneNumberBinding.inflate(inflater, container, false)

        binding.btnVerify.setOnClickListener {

        }

        binding.btnVerify.visibility = View.GONE
        binding.etPhoneNumber.doAfterTextChanged {
            Log.i("Ssdsds", it.toString())
            if (it?.length!! != 10) binding.btnVerify.visibility = View.INVISIBLE
            else binding.btnVerify.visibility = View.VISIBLE
        }
        return binding.root
    }



    companion object {
        @JvmStatic
        fun newInstance() = PhoneNumberFragment()
    }
}