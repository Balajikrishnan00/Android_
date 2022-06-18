package com.balaji_2_2_0_5.diffutilkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.diffutilkotlin.databinding.RowLayoutBinding

class RecyAdapter:RecyclerView.Adapter<RecyAdapter.RecyViewHolder>(){

    private var oldPersionList= emptyList<Persion>()

    inner class RecyViewHolder(val binding: RowLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder{
        return RecyViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder:RecyViewHolder, position: Int) {
        holder.binding.number.text=oldPersionList[position].No.toString()
        holder.binding.name.text=oldPersionList[position].Name
    }

    override fun getItemCount(): Int {
        return oldPersionList.size
    }
    fun setData(newPersionList:List<Persion>){
        val diffUtil=myDiffUtil(oldPersionList,newPersionList)
        val diffResult=DiffUtil.calculateDiff(diffUtil)
        oldPersionList=newPersionList
        diffResult.dispatchUpdatesTo(this)
    }

}
