package com.balaji_2_2_0_5.retrofit03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.retrofit03.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.retrofit03.model.MyDataItem
import com.balaji_2_2_0_5.retrofit03.model.MyDataItemItem
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var RecyAdapter:RecyAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)

        getMydata()

    }

    private fun getMydata() {
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build().create(ApiInterface::class.java)

        val retrofitData=retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItemItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItemItem>?>,
                response: Response<List<MyDataItemItem>?>
            ) {
                val responseBody=response.body()!!
                RecyAdapter=RecyAdapter(baseContext,responseBody)

                binding.recyclerView.adapter=RecyAdapter
                }

            override fun onFailure(call: Call<List<MyDataItemItem>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}

