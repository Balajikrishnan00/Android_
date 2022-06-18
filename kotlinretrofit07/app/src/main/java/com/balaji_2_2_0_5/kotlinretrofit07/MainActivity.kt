package com.balaji_2_2_0_5.kotlinretrofit07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.balaji_2_2_0_5.kotlinretrofit07.databinding.ActivityMainBinding
import com.balaji_2_2_0_5.kotlinretrofit07.repository.Repository
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.balaji_2_2_0_5.kotlinretrofit07.model.Post

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainviewmodel:MainViewModel

    lateinit var myAdapter:RecyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository=Repository()
        val viewModelFactory=MainViewModelFactory(repository)

        // get() = []
        mainviewmodel= ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]//.get(MainViewModel::class.java)

/*
        mainviewmodel.getPost()
        mainviewmodel.myResponse.observe(this, Observer { response ->

            if (response.isSuccessful) {

                binding.userIdData.text=response.body()?.userId.toString()
                binding.idData.text=response.body()?.id.toString()
                binding.titleData.text=response.body()?.title
                binding.bodyData.text=response.body()?.body
                Log.d("response", response.body()?.id.toString())
                Log.d("response", response.body()?.userId.toString())
                Log.d("response", response.body()?.title!!)
                Log.d("response", response.body()?.body!!)


            }else {

                //Log.d("response", response.errorBody()!!.toString())
            }
            })

*/

/*
        binding.btnFind.setOnClickListener {
            val currentNumber=binding.edText.text.toString()

            if (currentNumber.isEmpty()) {

                Toast.makeText(this, "Enter Integer", Toast.LENGTH_LONG).show()

            } else {


                mainviewmodel.getPost2(Integer.parseInt(currentNumber))

                mainviewmodel.myResponse2.observe(this, Observer { response2 ->

                    if (response2.isSuccessful) {

                        binding.userIdData.text=response2.body()?.userId.toString()
                        binding.idData.text=response2.body()?.id.toString()
                        binding.titleData.text=response2.body()?.title!!
                        binding.bodyData.text=response2.body()?.body!!
                    }
                    else{
                        Toast.makeText(this,"$currentNumber ID  not Found".toString(),Toast.LENGTH_SHORT).show()
                    }
                })
            }
        }

        */

/*
        binding.btnFind.setOnClickListener {
            val userID=binding.edText.text.toString()

            if (userID.isEmpty()){

                Toast.makeText(this,"Enter Integer Only",Toast.LENGTH_SHORT).show()

            }else{
                mainviewmodel.getCustomPost(Integer.parseInt(userID))

                mainviewmodel.customResponse3.observe(this, Observer  { CR ->

                    if (CR.isSuccessful){
                        CR.body()!!.forEach {
                            Log.d("RES",it.userId.toString())
                            Log.d("RES",it.id.toString())
                            Log.d("RES",it.title)
                            Log.d("RES",it.body)

                        }
                    }else{
                        Log.d("RES",CR.errorBody().toString())
                    }
                })
            }
        }
 */

/*
        binding.btnFind.setOnClickListener {

            val userID=binding.edText.text.toString()
            val sort="id"
            val order="asc"

            mainviewmodel.getCustomPost4(Integer.parseInt(userID),sort,order)

            mainviewmodel.customResponse4.observe(this, Observer {

                it.body()!!.forEach {
                    Log.d("Res",it.userId.toString())
                    Log.d("Res",it.id.toString())
                    Log.d("Res",it.title)
                    Log.d("Res",it.body)
                }
            })
        }

 */
/*

        val options:MutableMap<String,String> = hashMapOf()
        options["_sort"]= "id"
        options["_order"] = "asc"

        binding.btnFind.setOnClickListener {

            val number =binding.edText.text.toString()

            mainviewmodel.getCustomPost5(Integer.parseInt(number),options)

            mainviewmodel.customResponse5.observe(this, Observer {
                it.body()!!.forEach {
                    Log.d("Res",it.userId.toString())
                    Log.d("Res",it.id.toString())
                    Log.d("Res",it.title)
                    Log.d("Res",it.body)
                }
            })

        }

 */

/*
        val options:MutableMap<String,String> = hashMapOf()
        options["_sort"] = "id"
        options["_order"] = "asc"

        binding.btnFind.setOnClickListener {

            val number = binding.edText.text.toString()

            mainviewmodel.getCustomPost5(Integer.parseInt(number),options)

            mainviewmodel.customResponse5.observe(this, Observer { res ->

                binding.recyclerView.layoutManager=LinearLayoutManager(this)

                myAdapter= RecyAdapter(res.body()!!)
                binding.recyclerView.adapter=myAdapter

            })


        }

 */



        val post1=Post(1,1,"Welcome","Welcome to Kotlin")


        mainviewmodel.pushPost(post1)

        mainviewmodel.postResponse.observe(this, Observer {

            if (it.isSuccessful){
                Log.d("res",it.body().toString())
            }else{
                Log.d("res",it.errorBody().toString())
            }
        })
    }
}
