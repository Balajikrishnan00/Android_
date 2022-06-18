package com.balaji_2_2_0_5.retrofitkotlin2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.retrofitkotlin2.databinding.UiLayoutBinding
import com.balaji_2_2_0_5.retrofitkotlin2.model.TodoModel


class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(binding: UiLayoutBinding):RecyclerView.ViewHolder(binding.root)

    private val diffCallback=object :DiffUtil.ItemCallback<TodoModel>(){
        override fun areItemsTheSame(oldItem: TodoModel, newItem: TodoModel): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: TodoModel, newItem: TodoModel): Boolean {
            return oldItem == newItem
        }

        //private val differ=AsyncListDiffer(this,diffCallback)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(UiLayoutBinding.
        inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}