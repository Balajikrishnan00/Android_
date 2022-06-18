package com.balaji_2_2_0_5.recyclearview4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TwitterListAdapter:RecyclerView.Adapter<TwitterListAdapter.ListViewHolder>() {

     class ListViewHolder(view:View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val data=LayoutInflater.from(parent.context).inflate(R.layout.template_recycler,parent,false)
        return ListViewHolder(data)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}