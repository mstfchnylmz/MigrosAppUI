package com.mustafacihanyilmaz.migrosui.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mustafacihanyilmaz.migrosui.CampaingFragments.FirstCampaignFragment
import com.mustafacihanyilmaz.migrosui.CampaingFragments.FourthCampaignFragment
import com.mustafacihanyilmaz.migrosui.CampaingFragments.SecondCampaignFragment
import com.mustafacihanyilmaz.migrosui.CampaingFragments.ThirdCampaignFragment

class CampaignViewPagerAdapter(
    var context: Context?,
    fm: FragmentManager,
    var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstCampaignFragment()
            }
            1 -> {
                SecondCampaignFragment()
            }
            2 -> {
                ThirdCampaignFragment()
            }
            3 -> {
                FourthCampaignFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }


}