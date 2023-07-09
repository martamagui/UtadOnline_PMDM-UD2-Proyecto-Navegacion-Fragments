package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.utad.ud2_ejemplo01.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private lateinit var _binding: FragmentWelcomeBinding
    private val binding: FragmentWelcomeBinding get() = _binding

    private var name: String? = null
    private var email: String? = null

    private val args: WelcomeFragmentArgs by navArgs()

    companion object {
        const val nameKey = "name"
        const val emailKey = "email"

        @JvmStatic
        fun newInstance(nameValue: String, emailValue: String): WelcomeFragment {
            val bundle = Bundle()
            bundle.putString("name", nameValue)
            bundle.putString("email", emailValue)

            val welcomeFragment = WelcomeFragment()
            welcomeFragment.arguments = bundle

            return welcomeFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        //Extrer argumentos del bundle
        if (requireArguments().containsKey("name")) {
            name = requireArguments().getString("name")
        }
        if (requireArguments().containsKey("email")) {
            email = requireArguments().getString("email")
        }*/
        email = args.emailValue
        name = args.nameValue
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Lógica de la UI aquí :)
        binding.tvUserName.text = name
        binding.tvEmailValue.text = email
    }
}

