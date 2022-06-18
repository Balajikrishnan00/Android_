package com.balaji_2_2_0_5.coroutineskotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.balaji_2_2_0_5.coroutineskotlin.R


class FragmentB : Fragment() {

    val args:FragmentBArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val text =view.findViewById<TextView>(R.id.opText)
        text.text = args.edText

        val goBack = view.findViewById<Button>(R.id.btn_back)
        goBack.setOnClickListener {
            val action=FragmentBDirections.actionFragmentBToFragmentA()
            findNavController().navigate(action)
        }
        return view
    }

}