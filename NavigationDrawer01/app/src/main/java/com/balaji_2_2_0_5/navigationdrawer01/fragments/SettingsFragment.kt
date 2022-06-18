package com.balaji_2_2_0_5.navigationdrawer01.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.balaji_2_2_0_5.navigationdrawer01.R
import com.balaji_2_2_0_5.navigationdrawer01.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
    private var _binding:FragmentSettingsBinding?=null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

}