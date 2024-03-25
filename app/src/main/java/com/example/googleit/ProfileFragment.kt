package com.example.googleit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.googleit.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var profileBinding: FragmentProfileBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        profileBinding = FragmentProfileBinding.inflate(inflater)
        return profileBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.findViewById<View>(R.id.bottomNavigationView)?.visibility = View.VISIBLE
        navController = Navigation.findNavController(profileBinding.root)
        profileBinding.btnLogout.setOnClickListener {
            navController.navigate(R.id.action_profileFragment_to_loginFragment)
        }
    }

    companion object {

        fun newInstance() = ProfileFragment()
    }
}