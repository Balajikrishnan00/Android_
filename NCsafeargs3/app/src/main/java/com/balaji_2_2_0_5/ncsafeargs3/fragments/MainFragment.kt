package com.balaji_2_2_0_5.ncsafeargs3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.balaji_2_2_0_5.ncsafeargs3.R
import com.balaji_2_2_0_5.ncsafeargs3.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding= FragmentMainBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        binding.btnFragmentA.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToFragmentA())
        }
        binding.btnFragmentB.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToFragmentB())
        }
        return binding.root

        //inflater.inflate(R.layout.fragment_main, container, false)
    }

}