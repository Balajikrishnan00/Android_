package com.balaji_2_2_0_5.retrofitmvvm
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {


    companion object{
        private const val base_url = "https://gorest.co.in/public/"

        fun getInstance():Retrofit{

            val logging = HttpLoggingInterceptor()

            logging.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()

            client.addInterceptor(logging)

            return Retrofit.Builder()
                .baseUrl(base_url)
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}