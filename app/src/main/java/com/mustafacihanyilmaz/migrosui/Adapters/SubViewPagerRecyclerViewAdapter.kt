package com.mustafacihanyilmaz.migrosui.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassSubViewPager
import com.mustafacihanyilmaz.migrosui.DataClasses.FirstRVDataClass
import com.mustafacihanyilmaz.migrosui.R

class SubViewPagerRecyclerViewAdapter(val listSubViewPager: MutableList<DataClassSubViewPager>) :
    RecyclerView.Adapter<SubViewPagerRecyclerViewAdapter.FirstCampaignViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstCampaignViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_first_campaign, parent, false)
        return SubViewPagerRecyclerViewAdapter.FirstCampaignViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstCampaignViewHolder, position: Int) {
        holder.bindItems(listSubViewPager.get(position))
    }

    override fun getItemCount(): Int {
        return listSubViewPager.size
    }

    class FirstCampaignViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageViewSubViewPager : ImageView = view.findViewById(R.id.imageCardFirstCampaign)
        val titleTextSubViewPager : TextView = view.findViewById(R.id.titleFirstCampaignCard)
        val selectedNumberSubViewPager : TextView = view.findViewById(R.id.selectedNumberFirstCard)
        val unSelectedNumberSubViewPager : TextView = view.findViewById(R.id.unSelectedNumberFirstCard)
        val campaignButtonFirstCard : MaterialButton = view.findViewById(R.id.campaignButtonFirstCard)

        fun bindItems(item: DataClassSubViewPager) {

            imageViewSubViewPager.setImageResource(item.imageSubViewPaber)
            titleTextSubViewPager.setText(item.titleSubViewPager)
            selectedNumberSubViewPager.setText(item.selectedNumber)
            unSelectedNumberSubViewPager.setText(item.unSelectedNumber)

            campaignButtonFirstCard.background.alpha = 50
        }
    }
}