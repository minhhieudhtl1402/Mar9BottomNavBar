package com.example.mar9bottomnavigationbar.fragment

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mar9bottomnavigationbar.databinding.FragmentFavouriteBinding
import com.example.mar9bottomnavigationbar.databinding.FragmentHomeBinding

class FavouriteFragment : Fragment() {
    private lateinit var binding: FragmentFavouriteBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavouriteBinding.inflate(layoutInflater)
        return binding.root
    }
}