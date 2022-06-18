package com.balaji_2_2_0_5.retrofitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.balaji_2_2_0_5.retrofitkotlin.model.PostModel
import com.balaji_2_2_0_5.retrofitkotlin.model.Retrofit_Interface
import com.google.gson.Gson
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rF= Retrofit.Builder()
            .baseUrl(Retrofit_Interface.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()

        val API=rF.create(Retrofit_Interface::class.java)

        val call=API.posts

        call.enqueue(object :Callback<List<PostModel>>{
            override fun onResponse(
                call: Call<List<PostModel>>,
                response: Response<List<PostModel>>
            ) {
                val postsLists:List<PostModel> = response.body() as List<PostModel>
                val posts= arrayOfNulls<String>(postsLists.size)

                for ( i in postsLists.indices ){
                    posts[i]=postsLists[i].title

                    val adapter=ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,posts)
                    val listView:ListView=findViewById(R.id.list_view)
                    listView.adapter=adapter

                }
            }

            override fun onFailure(call: Call<List<PostModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}