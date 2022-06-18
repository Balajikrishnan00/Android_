package com.balaji_2_2_0_5.retrofitmvvm
import RecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.retrofitmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    private fun initRecyclerView(){
        recyclerViewAdapter.apply {
            val layoutManager = LinearLayoutManager(this@MainActivity)

            val decoration = DividerItemDecoration(this@MainActivity)


        }
    }

}