package com.utad.ud2_ejemplo01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN
import com.utad.ud2_ejemplo01.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var _binding: FragmentSignUpBinding
    private val binding: FragmentSignUpBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignUp.setOnClickListener {
            val nameValue = binding.etName.text.toString().trim()
            val emailValue = binding.etMail.text.toString().trim()

            if (nameValue.isNotEmpty() && emailValue.isNotEmpty()) {
                navigateToWelcomeFragment(nameValue, emailValue)
            } else {
                if (nameValue.isNullOrEmpty()) {
                    binding.etName.error = getString(R.string.sign_up_empty_field_error)
                }
                if (emailValue.isNullOrEmpty()) {
                    binding.etMail.error = getString(R.string.sign_up_empty_field_error)
                }
            }

        }
    }

    private fun navigateToWelcomeFragment(nameValue: String, emailValue: String) {
        val bundle = Bundle()
        bundle.putString("name", nameValue)
        bundle.putString("email", emailValue)

        val welcomeFragment = WelcomeFragment()
        welcomeFragment.arguments = bundle

        val transaction = parentFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.replace(R.id.fcv_test, welcomeFragment)
        transaction.addToBackStack(null)
        transaction.setTransition(TRANSIT_FRAGMENT_OPEN)
        transaction.commit()
    }

}