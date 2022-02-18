package com.mustafacihanyilmaz.migrosui.CampaingFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.mustafacihanyilmaz.migrosui.Adapters.FirstRecyclerViewMainAdapter
import com.mustafacihanyilmaz.migrosui.Adapters.SubViewPagerRecyclerViewAdapter
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassSubViewPager
import com.mustafacihanyilmaz.migrosui.DataClasses.FirstRVDataClass
import com.mustafacihanyilmaz.migrosui.R
import com.mustafacihanyilmaz.migrosui.databinding.FragmentFatihBinding
import com.mustafacihanyilmaz.migrosui.databinding.FragmentFirstCampaignBinding

class FirstCampaignFragment : Fragment() {

    private lateinit var binding: FragmentFirstCampaignBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstCampaignBinding.inflate(inflater,container,false);

        binding.recyclerViewFirstCampaign.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerViewFirstCampaign.adapter = SubViewPagerRecyclerViewAdapter(getSubFirstCampaignData())

        val snapHelper: SnapHelper = LinearSnapHelper()
        binding.recyclerViewFirstCampaign.onFlingListener = null
        snapHelper.attachToRecyclerView(binding.recyclerViewFirstCampaign)

        return binding.getRoot()
    }

    fun getSubFirstCampaignData(): MutableList<DataClassSubViewPager> {

        val firstCampaignDatas = mutableListOf(

            DataClassSubViewPager(R.drawable.campaign_image_2x,"1","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"2","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"3","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"4","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"5","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"6","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"7","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık.."),
            DataClassSubViewPager(R.drawable.campaign_image_2x,"8","8","10 TL’lik alkolsüz içecek alımına 2 Money hediye! Kullanmak için tık..")

        )

        return firstCampaignDatas

    }


}