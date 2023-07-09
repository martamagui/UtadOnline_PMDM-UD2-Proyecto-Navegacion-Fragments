package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN
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

        binding.btnGoToSignUp.setOnClickListener { navigateToSignUp() }

    }

    private fun navigateToSignUp() {
        val signUpFragment = SignUpFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.replace(R.id.fcv_test, signUpFragment)
        transaction.addToBackStack(null)
        transaction.setTransition(TRANSIT_FRAGMENT_OPEN)
        transaction.commit()
    }


}