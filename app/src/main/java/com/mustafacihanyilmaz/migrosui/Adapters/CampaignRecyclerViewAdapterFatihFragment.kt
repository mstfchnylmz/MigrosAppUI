package com.mustafacihanyilmaz.migrosui.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassCampaign
import com.mustafacihanyilmaz.migrosui.DataClasses.FirstRVDataClass
import com.mustafacihanyilmaz.migrosui.R

class CampaignRecyclerViewAdapterFatihFragment (val listCampaign : MutableList<DataClassCampaign>) :
    RecyclerView.Adapter<CampaignRecyclerViewAdapterFatihFragment.CampaignViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampaignViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_campaign, parent, false)
        return CampaignRecyclerViewAdapterFatihFragment.CampaignViewHolder(view)
    }

    override fun onBindViewHolder(holder: CampaignViewHolder, position: Int) {
        holder.bindItems(listCampaign.get(position))
    }

    override fun getItemCount(): Int {
        return listCampaign.size
    }

    class CampaignViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageCampaign : ImageView = view.findViewById(R.id.imageCampaignCard)
        val titleCampaign : TextView = view.findViewById(R.id.titleCampaignCard)

        fun bindItems(item: DataClassCampaign) {

            imageCampaign.setImageResource(item.imageCampaign)
            titleCampaign.setText(item.titleCampaign)

        }
    }
}