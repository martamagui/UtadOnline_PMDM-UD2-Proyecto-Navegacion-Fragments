package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utad.ud2_ejemplo01.databinding.FragmentInitialBinding


class InitialFragment : Fragment() {

    private lateinit var _binding: FragmentInitialBinding
    private val binding: FragmentInitialBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitialBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Lógica de los frg aquí :)
    }
}