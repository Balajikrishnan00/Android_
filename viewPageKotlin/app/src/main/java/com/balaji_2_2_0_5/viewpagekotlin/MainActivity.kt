package com.balaji_2_2_0_5.viewpagekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.balaji_2_2_0_5.viewpagekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var titleList= mutableListOf<String>()
    private var descList= mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        postToList()

        binding.viewPager.adapter=ViewPagerAdapter(titleList,descList,imageList)
        //binding.viewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL

        binding.indicator.setViewPager(binding.viewPager)
    }

    private fun addToList(title:String,description:String,image:Int){

        titleList.add(title)
        descList.add(description)
        imageList.add(image)
    }

    private fun postToList(){
        for ( i in 1..5){
            addToList("Title $i","Description $i",R.mipmap.ic_launcher_round)
        }
    }
}