package com.balaji_2_2_0_5.kotlingsonjson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.kotlingsonjson.Model.User
import com.balaji_2_2_0_5.kotlingsonjson.Model.UserModelClass
import com.balaji_2_2_0_5.kotlingsonjson.databinding.ActivityMainBinding
import com.google.gson.Gson
import org.json.JSONException
import java.io.IOException
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        try {
            val jsonString = createJsonObjectFromAssets()!!
            val user = Gson().fromJson(jsonString, UserModelClass::class.java)
            binding.recyclerView.layoutManager=LinearLayoutManager(this)
            val adapter=RecycleAdapter(user.users as ArrayList<User>)
            binding.recyclerView.adapter=adapter

        }catch (e: JSONException) {
            //exception
            e.printStackTrace()
        }
    }
    private fun createJsonObjectFromAssets(): String? {

        val json:String?
        val charset: Charset = Charsets.UTF_8
        try {
            // setup is important

            val fileOpen=assets.open("Json.json")
            val isAvailable=fileOpen.available()
            val buffer=ByteArray(isAvailable)
            fileOpen.read(buffer)
            fileOpen.close()
            json=String(buffer,charset)

        }catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}