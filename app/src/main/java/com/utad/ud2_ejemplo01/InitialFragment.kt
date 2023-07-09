package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE
import androidx.navigation.fragment.findNavController
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

        val bundle = Bundle()
        bundle.putString("arg", "ESTO ES MI MENSAJE DE RESULTADO")
        parentFragmentManager.setFragmentResult("resultado", bundle)

        binding.fabInitialNext.setOnClickListener {
            navigateNext()
        }
    }

    //Componente de navegación
    private fun navigateNext() {
        val action = InitialFragmentDirections.actionInitialFragmentToInitialSecondFragment()
        findNavController().navigate(action)
    }

    /*
    //Transacciones
    private fun navigateNext() {
        val secondFragment = InitialSecondFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.replace(R.id.fcv_test, secondFragment)
        transaction.setTransition(TRANSIT_FRAGMENT_FADE)
        transaction.addToBackStack(null)
        transaction.commit()
    }*/
}