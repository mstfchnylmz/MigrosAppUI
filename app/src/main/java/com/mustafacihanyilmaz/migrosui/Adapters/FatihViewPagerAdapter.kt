package com.mustafacihanyilmaz.migrosui.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mustafacihanyilmaz.migrosui.MainViewPagerFragments.AyricaliklarFragment
import com.mustafacihanyilmaz.migrosui.MainViewPagerFragments.FatihFragment
import com.mustafacihanyilmaz.migrosui.MainViewPagerFragments.FirsatlarFragment
import com.mustafacihanyilmaz.migrosui.MainViewPagerFragments.MigrosTVFragment

class FatihViewPagerAdapter  (var context: Context?, fm: FragmentManager, var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                //Football()
                FatihFragment()
            }
            1 -> {
                FirsatlarFragment()
            }
            2 -> {
                MigrosTVFragment()
            }
            3 -> {
                AyricaliklarFragment()
            }
            else -> getItem(position)


        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}