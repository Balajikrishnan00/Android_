package com.balaji_2_2_0_5.recyclerview5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.recyclerview5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     var RecyView: RecyclerView?=null
    var RecyAdapter:RecyAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        RecyView=binding.recyclerView

        var DataClass=ArrayList<UserData>()

        DataClass.add(UserData("Balaji Krishnan",25))
        DataClass.add(UserData("Welcome",34))

        RecyAdapter= RecyAdapter(this,DataClass)
        RecyView!!.adapter=RecyAdapter
        RecyView!!.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)






    }
}