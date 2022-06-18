package com.balaji_2_2_0_5.recyclerviewwithviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.recyclerviewwithviewbinding.Model.StudentsFiles
import com.balaji_2_2_0_5.recyclerviewwithviewbinding.databinding.ActivityMainBinding
import com.google.gson.Gson
import java.io.IOException
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(binding.root)

        val jsonString=createJsonObjectFromAssets()
        val students= Gson().fromJson(jsonString,StudentsFiles::class.java)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=RecyclerAdapter(this,students.students)
        binding.recyclerView.adapter=adapter

    }

    private fun createJsonObjectFromAssets(): String? {

        val json:String?
        val charset: Charset = Charsets.UTF_8
        try {
            // setup is important

            val fileOpen=assets.open("database.json")
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