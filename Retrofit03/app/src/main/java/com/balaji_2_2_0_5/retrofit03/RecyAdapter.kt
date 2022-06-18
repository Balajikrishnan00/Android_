package com.balaji_2_2_0_5.retrofit03

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.retrofit03.databinding.RowDataItemBinding
import com.balaji_2_2_0_5.retrofit03.model.MyDataItem
import com.balaji_2_2_0_5.retrofit03.model.MyDataItemItem

class RecyAdapter(val context: Context,val userList:List<MyDataItemItem>):RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {

    inner class RecyViewHolder( binding: RowDataItemBinding):RecyclerView.ViewHolder(binding.root){
        val id=binding.textId
        val title=binding.textTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        return RecyViewHolder(RowDataItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {

        holder.id.text=userList[position].id.toString()
        holder.title.text=userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}