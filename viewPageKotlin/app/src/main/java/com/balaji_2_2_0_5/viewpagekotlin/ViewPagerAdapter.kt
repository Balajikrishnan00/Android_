package com.balaji_2_2_0_5.viewpagekotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.viewpagekotlin.databinding.ItemPagerBinding

class ViewPagerAdapter(
    private var title:List<String>,
    private var detail:List<String>,
    private var image:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

        inner class ViewPagerViewHolder(binding: ItemPagerBinding):RecyclerView.ViewHolder(binding.root){

            val itemTitle=binding.titleText
            val itemDetail=binding.topicText
            val itemImage=binding.imageView

            init {
                itemImage.setOnClickListener {
                    val position = adapterPosition
                    Toast.makeText(itemView.context, "You Clicked image ${position+1}", Toast.LENGTH_SHORT).show()

                }
                itemTitle.setOnClickListener {
                    val position=adapterPosition
                    Toast.makeText(itemView.context,"You Clicked Title ${position+1}",Toast.LENGTH_SHORT).show()
                }
                itemDetail.setOnClickListener {
                    val position=adapterPosition
                        Toast.makeText(itemView.context,"You Clicked Detail ${position + 1}",Toast.LENGTH_LONG).show()
                }
            }
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder(ItemPagerBinding.
        inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.itemTitle.text=title[position]
        holder.itemDetail.text=detail[position]
        holder.itemImage.setImageResource(image[position])
    }
    override fun getItemCount(): Int {
        return title.size
    }
}