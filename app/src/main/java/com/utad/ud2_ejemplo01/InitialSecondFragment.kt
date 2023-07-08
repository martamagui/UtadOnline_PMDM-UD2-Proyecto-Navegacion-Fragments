package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utad.ud2_ejemplo01.databinding.FragmentInitialBinding
import com.utad.ud2_ejemplo01.databinding.FragmentInitialSecondBinding


class InitialSecondFragment : Fragment() {


    private lateinit var _binding: FragmentInitialSecondBinding
    private val binding: FragmentInitialSecondBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitialSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}