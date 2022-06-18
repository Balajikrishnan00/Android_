package com.balaji_2_2_0_5.kotlinjson02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context,val items:ArrayList<DataClass>):
RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>(){

    class RecyclerViewHolder(view: View):RecyclerView.ViewHolder(view){

        val getName:TextView = view.findViewById(R.id.data_name)
        val getType:TextView = view.findViewById(R.id.data_type)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ux_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item=items.get(position)

        holder.getName.text=item.Name
        holder.getType.text=item.Type
    }

    override fun getItemCount(): Int {
        return items.size
    }
}