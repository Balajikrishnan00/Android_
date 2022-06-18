package com.balaji_2_2_0_5.coroutineskotlin.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.balaji_2_2_0_5.coroutineskotlin.R
import kotlinx.coroutines.*


class FragmentA : Fragment() {
     private val scope = CoroutineScope(Dispatchers.IO + CoroutineName("MyScope"))
    //var scope: CoroutineScope
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //var scope = CoroutineScope(CoroutineName("MyScope"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        //val scope = CoroutineScope(CoroutineName("MyScope"))
/*
        scope.launch {
            Log.d("scope",this.coroutineContext.toString())
            launch {
                Log.d("coroutine",this.coroutineContext.toString())
            }
        }

 */

 /*       GlobalScope.launch {
            while (true){
                delay(1000L)
                Log.d("Coroutine","Running")
            }
        }


  */

        lifecycleScope.launch {
            while (true){
                delay(1000L)
                Log.d("Coroutine","Running")
            }
        }
        view.findViewById<Button>(R.id.button).setOnClickListener {
            val edtext=view.findViewById<TextView>(R.id.edtext).text.toString()
            val action=FragmentADirections.actionFragmentAToFragmentB(edtext)//.setEdText(edtext)
            //Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
            findNavController().navigate(action)
        }
        return view
    }

    override fun onPause() {
        super.onPause()
        Log.d("Coroutine","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Coroutine","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Coroutine","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Coroutine","onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Coroutine","onDestroy")
    }

}