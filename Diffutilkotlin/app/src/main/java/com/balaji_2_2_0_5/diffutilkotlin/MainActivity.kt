package com.balaji_2_2_0_5.diffutilkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.diffutilkotlin.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.diffutilkotlin.databinding.RowLayoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        val recyAdapter:RecyAdapter= RecyAdapter()
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=recyAdapter

        val persion1=Persion(1,"Balaji")
        val persion2=Persion(2,"Balaji")
        val persion3=Persion(3,"Balaji")
        val persion4=Persion(4,"Balaji")

        recyAdapter.setData(listOf(persion1,persion2,persion3,persion4))

        binding.button.setOnClickListener {
            val persion5=Persion(5,"Balaji")
            recyAdapter.setData(listOf(persion1,persion2,persion3,persion4,persion5))
        }
    }
}