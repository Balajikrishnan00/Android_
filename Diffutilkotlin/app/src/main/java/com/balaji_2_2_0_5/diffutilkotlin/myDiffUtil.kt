package com.balaji_2_2_0_5.diffutilkotlin

import androidx.recyclerview.widget.DiffUtil

class myDiffUtil(
    private val oldList: List<Persion>,
    private val newList:List<Persion>):DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].No==newList[newItemPosition].No
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when{
            oldList[oldItemPosition].No != newList[newItemPosition].No->{
                false
            }oldList[oldItemPosition].Name != newList[newItemPosition].Name->{
                false
            } else -> true
        }
    }
}