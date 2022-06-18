package com.balaji_2_2_0_5.kotlinretrofit05

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.kotlinretrofit05.databinding.UiRowLayoutBinding
import com.balaji_2_2_0_5.kotlinretrofit05.model.DataListItem

class RecyAdapter(val context: Context,val userList:List<DataListItem>):RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {

    inner class RecyViewHolder(binding: UiRowLayoutBinding):RecyclerView.ViewHolder(binding.root){
        val id=binding.idText
        val userID=binding.useridText
        val completed=binding.completedText
        val title=binding.titleText

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {

        return RecyViewHolder(UiRowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {
        holder.id.text=userList[position].id.toString()
        holder.userID.text=userList[position].userId.toString()
        holder.completed.text=userList[position].completed.toString()
        holder.title.text=userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}