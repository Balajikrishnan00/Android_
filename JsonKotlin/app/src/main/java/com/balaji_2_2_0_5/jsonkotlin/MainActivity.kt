package com.balaji_2_2_0_5.jsonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.jsonkotlin.Model.UserModel
import com.balaji_2_2_0_5.jsonkotlin.databinding.ActivityMainBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var recyclerView: RecyclerView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userLists:ArrayList<UserModel> = ArrayList()

        try {

            val obj=JSONObject(getJSONFromAssets()!!)
            val userArray=obj.getJSONArray("users")

            for (i in 0 until userArray.length()) {
                val users = userArray.getJSONObject(i)

                val id = users.getInt("id")
                val name = users.getString("name")
                val email = users.getString("email")
                val gender = users.getString("gender")
                val weight = users.getDouble("weight")
                val height = users.getInt("height")

                val phone = users.getJSONObject("phone")

                val mobile = phone.getString("mobile")
                val office = phone.getString("office")

                val userDetails = UserModel(id, name, email, gender, weight, height, mobile, office)

                userLists.add(userDetails)

            }
        }
        catch (e: JSONException) {
            //exception
            e.printStackTrace()
        }

        recyclerView=binding.recyclerView
        val itemAdapter=UserAdapter(this, userLists)
        recyclerView!!.adapter=itemAdapter
        recyclerView!!.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)


    }

    fun getJSONFromAssets(): String? {

        var json: String?=null
        val charset: Charset = Charsets.UTF_8
        try {
            val myUsersJSONFile = assets.open("users.json")
            val size = myUsersJSONFile.available()
            val buffer = ByteArray(size)
            myUsersJSONFile.read(buffer)
            myUsersJSONFile.close()
            json = String(buffer, charset)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json


    }

    /*
    private fun toJson(data:String): JSONObject {

        var newData: String = data.replace("\"","")
        newData = newData.replace("{","")
        newData = newData.replace("}","")

        val newObject = newData.split(":")
        val name = newObject[0]
        val value = newObject[1]
        val rootObject = JSONObject()
        rootObject.put(name,value)

        return rootObject
    }
 */

}
