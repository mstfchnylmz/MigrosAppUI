package com.mustafacihanyilmaz.migrosui.MainViewPagerFragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.google.android.material.tabs.TabLayout
import com.mustafacihanyilmaz.migrosui.Adapters.*
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassCampaign
import com.mustafacihanyilmaz.migrosui.DataClasses.DataClassYourCampaign
import com.mustafacihanyilmaz.migrosui.DataClasses.FirstRVDataClass
import com.mustafacihanyilmaz.migrosui.R
import com.mustafacihanyilmaz.migrosui.databinding.FragmentFatihBinding


class FatihFragment : Fragment() {

    private lateinit var binding: FragmentFatihBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFatihBinding.inflate(inflater,container,false);

        binding.firstRecyclerViewFatihFragment.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.firstRecyclerViewFatihFragment.adapter = FirstRecyclerViewMainAdapter(getFirstData())

        binding.subTabLayoutFatihFragment.addTab(binding.subTabLayoutFatihFragment.newTab().setText("Tam Bana Göre"))
        binding.subTabLayoutFatihFragment.addTab(binding.subTabLayoutFatihFragment.newTab().setText("Money Kampanyaları"))
        binding.subTabLayoutFatihFragment.addTab(binding.subTabLayoutFatihFragment.newTab().setText("Sağlıklı Yaşam"))

        binding.subTabLayoutFatihFragment.tabGravity = TabLayout.GRAVITY_FILL
        val subViewPagerAdapter = CampaignViewPagerAdapter(context, requireActivity().supportFragmentManager, binding.subTabLayoutFatihFragment.tabCount)

        binding.subViewPagerFatihFragment.adapter = subViewPagerAdapter
        binding.subViewPagerFatihFragment.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                binding.subTabLayoutFatihFragment
            )
        )

        binding.subTabLayoutFatihFragment.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.subViewPagerFatihFragment.currentItem = tab.position
                //binding.mainTabLayout.setTabIconTintResource(R.drawable.ic_baseline_circle_24)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        binding.campaignRecyclerViewFatihFragment.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        binding.campaignRecyclerViewFatihFragment.adapter = CampaignRecyclerViewAdapterFatihFragment(getCampaignData())

        val firstSnapHelper: SnapHelper = LinearSnapHelper()
        binding.campaignRecyclerViewFatihFragment.onFlingListener = null
        firstSnapHelper.attachToRecyclerView(binding.campaignRecyclerViewFatihFragment)

        binding.yourCampaignRecyclerViewFatihFragment.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.yourCampaignRecyclerViewFatihFragment.adapter = YourCampaignRecyclerViewAdapter(getYourCampaign())

        val secondSnapHelper: SnapHelper = LinearSnapHelper()
        binding.yourCampaignRecyclerViewFatihFragment.onFlingListener = null
        secondSnapHelper.attachToRecyclerView(binding.yourCampaignRecyclerViewFatihFragment)


        return binding.getRoot()
    }

    fun getFirstData(): MutableList<FirstRVDataClass> {

        val firstDatas = mutableListOf(

            FirstRVDataClass(R.drawable.screenshot20210408135806,"Sepet bişeyleri"),
            FirstRVDataClass(R.drawable.aldim_bitti_image,"Aldım Gitti"),
            FirstRVDataClass(R.drawable.tikla_gel_al,"Tıkla Gel Al"),
            FirstRVDataClass(R.drawable.uc_al_iki_ode,"Çoklu İndirim"),
            FirstRVDataClass(R.drawable.screenshot20210408135806,"Sepet bişeyleri 5"),
            FirstRVDataClass(R.drawable.screenshot20210408135806,"Sepet bişeyleri 6")
        )

        return firstDatas

    }

    fun getCampaignData(): MutableList<DataClassCampaign> {
        val campaignDatas = mutableListOf(

            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),
            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),
            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),
            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),
            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),
            DataClassCampaign(R.drawable.main_campaign_image_2x, "Lorem ipsum"),

        )

        return campaignDatas
    }

    fun getYourCampaign(): MutableList<DataClassYourCampaign> {
        val yourCampaignData = mutableListOf(
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"1","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"2","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"3","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"4","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"5","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"6","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"7","8"),
            DataClassYourCampaign(R.drawable.image_your_campaign,
                R.string.title_your_campaign,"8","8"),

        )

        return yourCampaignData
    }

}