package com.balaji_2_2_0_5.navigationcomponent02.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.balaji_2_2_0_5.navigationcomponent02.R


class VerifyFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val Name=arguments?.getString("name")
        val Number=arguments?.getString("number")

        val rootView= inflater.inflate(R.layout.fragment_verify, container, false)

        val dataName =rootView.findViewById<TextView>(R.id.data_name)

        val dataNumber =rootView.findViewById<TextView>(R.id.data_number)

        dataName.text=Name
        dataNumber.text=Number


        return rootView
    }

}