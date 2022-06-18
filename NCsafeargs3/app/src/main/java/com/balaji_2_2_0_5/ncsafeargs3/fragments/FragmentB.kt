package com.balaji_2_2_0_5.ncsafeargs3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.balaji_2_2_0_5.ncsafeargs3.R
import com.balaji_2_2_0_5.ncsafeargs3.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.ncsafeargs3.databinding.FragmentBBinding


class FragmentB : Fragment() {
    private var _binding:FragmentBBinding?=null
    private val binding get()=_binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding= FragmentBBinding.inflate(layoutInflater)
        binding.btnMessage.setOnClickListener {
            val bMessage=binding.EdText.text
            val action = FragmentBDirections.actionFragmentBToFragmentC().setMessage(bMessage.toString())
            findNavController().navigate(action)
        }
        return binding.root
    //inflater.inflate(R.layout.fragment_b, container, false)
    }

}