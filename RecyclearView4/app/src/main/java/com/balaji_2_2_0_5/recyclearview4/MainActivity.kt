package com.balaji_2_2_0_5.recyclearview4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.balaji_2_2_0_5.recyclearview4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var twitterListView:RecyclerView?=null
    var twitterListAdapter:TwitterListAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        twitterListView=binding.recyclerViewLayout

        twitterListAdapter= TwitterListAdapter()

        twitterListView!!.adapter=twitterListAdapter

        twitterListView!!.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)

    }

}