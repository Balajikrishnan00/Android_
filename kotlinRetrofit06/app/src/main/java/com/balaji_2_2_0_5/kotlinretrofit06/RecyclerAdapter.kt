package com.balaji_2_2_0_5.kotlinretrofit06

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.balaji_2_2_0_5.kotlinretrofit06.databinding.RvItemBinding
import com.balaji_2_2_0_5.kotlinretrofit06.networking.Character


class RecyclerAdapter(val context: Context, private val character:List<Character>):RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(binding: RvItemBinding):RecyclerView.ViewHolder(binding.root){

        val name=binding.nameText
        val image=binding.imageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.name.text=character[position].name
        holder.image.load(character[position].image)
    }

    override fun getItemCount(): Int {
        return character.size
    }

}