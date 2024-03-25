package com.example.googleit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.googleit.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {

    private lateinit var registrationBinding: FragmentRegistrationBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        registrationBinding = FragmentRegistrationBinding.inflate(inflater)

        return registrationBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(registrationBinding.root)
        registrationBinding.btnSignUpRegistration.setOnClickListener {
            navController.navigate(R.id.action_registrationFragment_to_loginFragment)
        }
    }

    companion object {
        fun newInstance() = RegistrationFragment()
    }
}