package com.balaji_2_2_0_5.kotlinjson02


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.kotlinjson02.databinding.ActivityMainBinding
import org.json.JSONArray
import org.json.JSONException
import java.io.IOException
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList: ArrayList<DataClass> = ArrayList()

        try {
            val arrayJson = JSONArray(createJsonObjectFromAssets()!!)

            for (i in 0 until arrayJson.length()) {

                val data = arrayJson.getJSONObject(i)

                val name = data.getString("name")
                val type = data.getString("type")

                val userDetails = DataClass(name, type)
                arrayList.add(userDetails)
            }

        }
        catch (e: JSONException) {
            //exception
            e.printStackTrace()
        }
        val passData=RecyclerAdapter(this,arrayList)
        binding.recyclerView.adapter=passData
        binding.recyclerView.layoutManager=LinearLayoutManager(this)

    }

    private fun createJsonObjectFromAssets(): String? {

        val json:String?

        try {
            // setup is important
            val charset: Charset = Charsets.UTF_8
            val fileOpen=assets.open("data.json")
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