package com.course.thecocktailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CocktailListAdapter(val cocktailList: ArrayList<CocktailModel>) :
    RecyclerView.Adapter<CocktailListAdapter.CocktailViewHolder>() {

    class CocktailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_cell, parent, false)
        return CocktailViewHolder(view)

    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        val  cardTitle =  holder.itemView.findViewById<TextView>(R.id.cardTitle)
        val  imageView=  holder.itemView.findViewById<ImageView>(R.id.cardIcon)
        val  detailText = holder.itemView.findViewById<TextView>(R.id.detailTitle)
        cardTitle.text= cocktailList[position].name
        Glide.with(holder.itemView.context).load(cocktailList[position].imageUrl).into(imageView)
        detailText.text= cocktailList[position].ingredients.toString()



    }

    override fun getItemCount(): Int {
        return cocktailList.count()

    }


}