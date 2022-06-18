package com.balaji_2_2_0_5.ncsafeargs3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.balaji_2_2_0_5.ncsafeargs3.R
import com.balaji_2_2_0_5.ncsafeargs3.databinding.FragmentCBinding


class FragmentC : Fragment() {
    val args:FragmentCArgs by navArgs<FragmentCArgs>()
    private var _binding:FragmentCBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding= FragmentCBinding.inflate(layoutInflater)
        binding.message.text=args.message
        return binding.root
        //inflater.inflate(R.layout.fragment_c, container, false)
    }
}