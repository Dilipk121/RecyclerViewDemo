package com.example.recyclerviewdemo.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.data.News

class NewsAdapter(val context: Activity, val arrayList: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.myViewHolder>() {

    // it hold view so view not created every time, just because it is memory efficient
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hTitle = itemView.findViewById<TextView>(R.id.tv_title)
        val h_image = itemView.findViewById<ImageView>(R.id.h_image)

    }

    //to create new instance
    //when layout manager fails to find suitable view for each items
    //its return view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_list_items,parent,false)

        return myViewHolder(itemView) // its returning view holder
    }

    //return the size of list items
    override fun getItemCount(): Int {
        return arrayList.size
    }

    //populates item with data
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val currentItem = arrayList[position]

        holder.hTitle.text = currentItem.headLine
        holder.h_image.setImageResource(currentItem.image)


    }


}