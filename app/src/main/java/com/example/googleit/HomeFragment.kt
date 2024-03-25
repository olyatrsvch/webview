package com.example.googleit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.googleit.databinding.ActivityMainBinding
import com.example.googleit.databinding.FragmentHomeBinding
import com.example.googleit.databinding.FragmentLoginBinding


class HomeFragment : Fragment() {

    private lateinit var homeBinding: FragmentHomeBinding
    private val adapter = WebsitesAdapter()
    private val websitesList = listOf<WebsiteItem>(
        WebsiteItem("Radiooooo", R.drawable.radiooooo_website),
        WebsiteItem("Letter for future", R.drawable.letter_website),
        WebsiteItem("Liveplasma", R.drawable.liveplasma_website),
        WebsiteItem("Endangered sounds museum", R.drawable.endangeredsounds_website),
        WebsiteItem("8-bit avatar constructor", R.drawable.pixelart_website),
        WebsiteItem("Rain sounds", R.drawable.rainsounds_website),
        WebsiteItem("Random predictions generator", R.drawable.predictions_website),
        WebsiteItem("Catch a black cat", R.drawable.blackcat_webiste),
        WebsiteItem("How many people there are in space", R.drawable.spacepeople_website),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeBinding = FragmentHomeBinding.inflate(inflater)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.findViewById<View>(R.id.bottomNavigationView)?.visibility = View.VISIBLE
        initRecyclerView()
        adapter.addWebsites(websitesList)
    }

    private fun initRecyclerView() {
        homeBinding.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@HomeFragment.context)
            recyclerView.adapter = adapter
        }
    }

    companion object {

        fun newInstance() = HomeFragment()
    }
}