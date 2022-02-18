package com.mustafacihanyilmaz.migrosui.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassCampaign
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassYourCampaign
import com.mustafacihanyilmaz.migrosui.R
import org.w3c.dom.Text

class YourCampaignRecyclerViewAdapter(val listYourCampaign: MutableList<DataClassYourCampaign>):
    RecyclerView.Adapter<YourCampaignRecyclerViewAdapter.YourCampaignViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YourCampaignViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_your_campaign, parent, false)
        return YourCampaignRecyclerViewAdapter.YourCampaignViewHolder(view)
    }

    override fun onBindViewHolder(holder: YourCampaignViewHolder, position: Int) {
        holder.bindItems(listYourCampaign.get(position))
    }

    override fun getItemCount(): Int {
        return listYourCampaign.size
    }

    class YourCampaignViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imageYourCampaign : ImageView = view.findViewById(R.id.imageYourCampaign)
        val selectedNumberYourCampaign : TextView = view.findViewById(R.id.selectedNumberYourCampaign)
        val unSelectedNumberYourCampaign : TextView = view.findViewById(R.id.unSelectedNumberYourCampaign)
        val titleYourCampaign : TextView = view.findViewById(R.id.titleYourCampaign)
        val buttonYourCampaign : MaterialButton = view.findViewById(R.id.buttonYourCampaign)

        fun bindItems(item: DataClassYourCampaign) {

            imageYourCampaign.setImageResource(item.imageYourCampaign)
            titleYourCampaign.setText(item.titleYourCampaign)
            selectedNumberYourCampaign.setText(item.selectedTextYourCampaign)
            unSelectedNumberYourCampaign.setText(item.unselectedTextYourCampaign)

            buttonYourCampaign.background.alpha = 50

        }
    }

}