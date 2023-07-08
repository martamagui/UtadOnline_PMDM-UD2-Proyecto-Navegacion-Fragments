package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utad.ud2_ejemplo01.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var _binding: FragmentSignUpBinding
    private val binding: FragmentSignUpBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}