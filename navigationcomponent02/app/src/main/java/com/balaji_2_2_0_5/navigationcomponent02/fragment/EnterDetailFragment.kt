package com.balaji_2_2_0_5.navigationcomponent02.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.balaji_2_2_0_5.navigationcomponent02.R


class EnterDetailFragment : Fragment() {

    //lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView=inflater.inflate(R.layout.fragment_enter_detail, container, false)

        val etName=rootView.findViewById<EditText>(R.id.name_text)
        val etMobileNumber=rootView.findViewById<EditText>(R.id.number_text)

        val verifyDetails=rootView.findViewById<Button>(R.id.btn_verify)

        verifyDetails.setOnClickListener {
            val name=etName.text.toString()
            val mobileNumber=etMobileNumber.text.toString()

            when{
                name.isEmpty() ->{
                    Toast.makeText(activity,"Enter Name",Toast.LENGTH_LONG).show()
                }
                mobileNumber.isEmpty()->{
                    Toast.makeText(activity,"Enter Mobile Number",Toast.LENGTH_LONG).show()
                }
                else ->{
                    val bundle= bundleOf(
                        "name" to name,"number" to mobileNumber)
                    findNavController().navigate(R.id.action_enterDetailFragment_to_verifyFragment,bundle)
                }
            }

            //Navigation.findNavController(rootView).navigate(R.id.action_enterDetailFragment_to_verifyFragment)

        }
        return rootView
    }
}