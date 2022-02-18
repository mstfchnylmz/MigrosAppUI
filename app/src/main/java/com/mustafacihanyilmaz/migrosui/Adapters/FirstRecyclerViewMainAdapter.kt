package com.mustafacihanyilmaz.migrosui.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mustafacihanyilmaz.migrosui.DataClasses.FirstRVDataClass
import com.mustafacihanyilmaz.migrosui.R

class FirstRecyclerViewMainAdapter (val listFirstRV : MutableList<FirstRVDataClass>) :
    RecyclerView.Adapter<FirstRecyclerViewMainAdapter.FirstViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_first_recyclerview, parent, false)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bindItems(listFirstRV.get(position))

    }

    override fun getItemCount(): Int {
        return listFirstRV.size
    }

    class FirstViewHolder(view:View):RecyclerView.ViewHolder(view){
        val image : ImageView = view.findViewById(R.id.imageFirstCard)
        val titleText : TextView = view.findViewById(R.id.titleFirstCard)

        fun bindItems(item: FirstRVDataClass) {

            image.setImageResource(item.image)
            titleText.setText(item.title)
        }
    }

}