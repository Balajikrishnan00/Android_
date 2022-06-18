package com.balaji_2_2_0_5.ncsafeargs3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.balaji_2_2_0_5.ncsafeargs3.R
import com.balaji_2_2_0_5.ncsafeargs3.databinding.FragmentABinding


class FragmentA : Fragment() {
    private var _binding:FragmentABinding?=null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding= FragmentABinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_a, container, false)
    }

}