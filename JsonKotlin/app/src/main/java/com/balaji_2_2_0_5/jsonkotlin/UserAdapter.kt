package com.balaji_2_2_0_5.jsonkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.jsonkotlin.Model.UserModel

class UserAdapter(val context: Context, var items:ArrayList<UserModel>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

        class  UserViewHolder(view: View):RecyclerView.ViewHolder(view){


            val tvID=view.findViewById<TextView>(R.id.tv_user_id)
            val tvName=view.findViewById<TextView>(R.id.tv_user_name)
            val tvEmail=view.findViewById<TextView>(R.id.tv_user_email)
            val tvGender=view.findViewById<TextView>(R.id.tv_user_gender)
            val tvWeight=view.findViewById<TextView>(R.id.tv_user_weight)
            val tvHeight=view.findViewById<TextView>(R.id.tv_user_height)
            val tvMobile=view.findViewById<TextView>(R.id.tv_user_mobile)
            val tvOffice=view.findViewById<TextView>(R.id.tv_user_office)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_template,parent,false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val item=items.get(position)

        holder.tvID.text=item.ID.toString()
        holder.tvName.text=item.NAME
        holder.tvEmail.text=item.EMAIL
        holder.tvGender.text=item.GENDER
        holder.tvWeight.text=item.WEIGHT.toString()
        holder.tvHeight.text=item.HEIGHT.toString()
        holder.tvMobile.text=item.MOBILE
        holder.tvOffice.text=item.OFFICE

    }

    override fun getItemCount(): Int {
        return items.size
    }

}