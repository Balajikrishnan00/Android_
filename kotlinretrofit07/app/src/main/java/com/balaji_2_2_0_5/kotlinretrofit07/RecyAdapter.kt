package com.balaji_2_2_0_5.kotlinretrofit07

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.kotlinretrofit07.databinding.UiLauoutBinding
import com.balaji_2_2_0_5.kotlinretrofit07.model.Post

class RecyAdapter(val response:List<Post>):RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {

    inner class RecyViewHolder(val binding: UiLauoutBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        return RecyViewHolder(UiLauoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {

        holder.binding.userIdText.text =response[position].userId.toString()
        holder.binding.idText.text = response[position].id.toString()
        holder.binding.titleText.text = response[position].title
        holder.binding.bodyText.text = response[position].body

    }

    override fun getItemCount(): Int {
        return  response.size
    }


}