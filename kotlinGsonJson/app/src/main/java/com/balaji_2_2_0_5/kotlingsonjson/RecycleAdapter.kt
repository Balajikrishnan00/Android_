package com.balaji_2_2_0_5.kotlingsonjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.kotlingsonjson.Model.User


class RecycleAdapter(private val items: ArrayList<User>):
    RecyclerView.Adapter<RecycleAdapter.RecyclerViewHolder>() {

        class RecyclerViewHolder(view: View):RecyclerView.ViewHolder(view){

            val firstName: TextView =view.findViewById(R.id.data_firstname)
            val lastName: TextView=view.findViewById(R.id.data_lastname)
            val regNumber: TextView=view.findViewById(R.id.data_RegisterNumber)
            val rollNumber: TextView=view.findViewById(R.id.data_roll_number)
            val dOB: TextView=view.findViewById(R.id.data_dob)
            val tamilMark: TextView=view.findViewById(R.id.data_tamil)
            val englishMark: TextView=view.findViewById(R.id.data_english)
            val mathsMark: TextView=view.findViewById(R.id.data_maths)
            val scienceMark: TextView=view.findViewById(R.id.data_science)
            val socialMark: TextView=view.findViewById(R.id.data_social)
            val totalMark: TextView=view.findViewById(R.id.data_total)
            val result: TextView =view.findViewById(R.id.data_result)



        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layout=LayoutInflater.from(parent.context).inflate(R.layout.ui_layout,parent,false)

        return RecyclerViewHolder(layout)
    }
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        val currentPos= items[position]

        holder.firstName.text=currentPos.Name.firstName
        holder.lastName.text=currentPos.Name.lastName
        holder.regNumber.text=currentPos.RegisterNumber
        holder.rollNumber.text=currentPos.RollNumber
        holder.dOB.text=currentPos.DOB
        holder.tamilMark.text=currentPos.Marks.Tamil.toString()
        holder.englishMark.text=currentPos.Marks.English.toString()
        holder.mathsMark.text=currentPos.Marks.Maths.toString()
        holder.scienceMark.text=currentPos.Marks.Science.toString()
        holder.socialMark.text=currentPos.Marks.Social.toString()
        holder.totalMark.text=currentPos.Total
        holder.result.text=currentPos.Result


    }
    override fun getItemCount(): Int {
        return items.size
    }
}