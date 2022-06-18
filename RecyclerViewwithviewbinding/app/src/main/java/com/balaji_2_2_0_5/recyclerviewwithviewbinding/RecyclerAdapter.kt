package com.balaji_2_2_0_5.recyclerviewwithviewbinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.recyclerviewwithviewbinding.Model.Student
import com.balaji_2_2_0_5.recyclerviewwithviewbinding.Model.StudentsFiles
import com.balaji_2_2_0_5.recyclerviewwithviewbinding.databinding.UiLayoutBinding

class RecyclerAdapter(val context: Context, val items: List<Student>):RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(binding: UiLayoutBinding):RecyclerView.ViewHolder(binding.root){

        val studentName=binding.nameData
        val studentAge=binding.ageData

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding=UiLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentElement=items[position]
        holder.studentName.text=currentElement.name
        holder.studentAge.text=currentElement.age.toString()

    }

    override fun getItemCount(): Int {
        return items.size
    }
}