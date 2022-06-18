package com.balaji_2_2_0_5.kotlinretrofit06

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.balaji_2_2_0_5.kotlinretrofit06.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.kotlinretrofit06.networking.ApiClient
import com.balaji_2_2_0_5.kotlinretrofit06.networking.CharacterResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var RecyclerAdapter:RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val client=ApiClient.apiService.fetchCharacter("3")
        client.enqueue(object : Callback<CharacterResponse?> {
            override fun onResponse(
                call: Call<CharacterResponse?>,
                response: Response<CharacterResponse?>
            ) {
                if (response.isSuccessful){
                    Log.d("character",""+response.body())

                    val result=response.body()!!.result

                    result.let {
                        binding.recyclerView.adapter=RecyclerAdapter(baseContext,result)
                    }

                }
            }

            override fun onFailure(call: Call<CharacterResponse?>, t: Throwable) {
                Log.d("failure",""+t.message)
            }
        })

    }
}