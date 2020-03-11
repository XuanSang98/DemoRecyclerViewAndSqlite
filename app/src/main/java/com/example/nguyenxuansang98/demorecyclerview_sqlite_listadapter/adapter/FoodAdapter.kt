package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.Resource
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.R
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.inteface.CustomItemClickListener
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.model.Food
import kotlinx.android.synthetic.main.food_item.view.*

class FoodAdapter :ListAdapter<Food,FoodAdapter.ViewHolder>(FoodDiffCallBack()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binData(getItem(position))
        holder.setOnCustomItemClickListenner(object : CustomItemClickListener{
            override fun clickItemFood(view: View, position: Int) {
                Toast.makeText(holder.itemView.context,"Ten : "+position,Toast.LENGTH_LONG).show()
            }

        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{
        var customListenner : CustomItemClickListener? =null
        fun binData(food: Food){
            itemView.txt_foodItem.text = food.nameFood
            Glide.with(itemView.context).load(food.urlImage).into(itemView.img_foodItem)
            itemView.setOnClickListener(this)
            itemView.img_favorite.setOnClickListener {
                itemView.img_favorite.setImageDrawable(itemView.getResources().getDrawable(R.drawable.passion));
            }
        }
        fun setOnCustomItemClickListenner(itemClickListener: CustomItemClickListener){
            this.customListenner = itemClickListener
        }

        override fun onClick(v: View?) {
            this.customListenner!!.clickItemFood(v!!,adapterPosition)
        }
    }
    class FoodDiffCallBack : DiffUtil.ItemCallback<Food>(){
        override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean =
            oldItem.nameFood == newItem.nameFood

    }
}