package com.balaji_2_2_0_5.kotlinretrofit05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.kotlinretrofit05.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.kotlinretrofit05.model.DataListItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var RecyAdapter:RecyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        runApi()
    }

    private fun runApi() {
        val rBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/").build()
            .create(RetrofitInterface::class.java)

        val retrofitData=rBuilder.getData()

        // ctrl + shift + space key
        retrofitData.enqueue(object : Callback<List<DataListItem>?> {
            override fun onResponse(
                call: Call<List<DataListItem>?>,
                response: Response<List<DataListItem>?>
            ) {
                val responseBody=response.body()!!
                binding.recyclerView.adapter=RecyAdapter(baseContext,responseBody)


            }

            override fun onFailure(call: Call<List<DataListItem>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })


    }
}


