package com.balaji_2_2_0_5.recyclerview5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyAdapter(val context: Context,val itemList:ArrayList<UserData>):RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {

    class RecyViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvName=view.findViewById<TextView>(R.id.data_username)
        val tvAge=view.findViewById<TextView>(R.id.data_age)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        return RecyViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.temp_layout,parent,false))
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {
        val pos=itemList.get(position)

        holder.tvName.text=pos.Username
        holder.tvAge.text= pos.Age.toString()
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}