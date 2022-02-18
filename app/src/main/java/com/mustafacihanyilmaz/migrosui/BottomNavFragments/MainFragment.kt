package com.mustafacihanyilmaz.migrosui.BottomNavFragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.mustafacihanyilmaz.migrosui.Adapters.MainViewPagerAdapter
import com.mustafacihanyilmaz.migrosui.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false);

        binding.mainTabLayout.addTab(binding.mainTabLayout.newTab().setText("Fatih"))
        binding.mainTabLayout.addTab(binding.mainTabLayout.newTab().setText("Fırsatlar"))
        binding.mainTabLayout.addTab(binding.mainTabLayout.newTab().setText("MigrosTV"))
        binding.mainTabLayout.addTab(binding.mainTabLayout.newTab().setText("Ayrıcalıklar"))

        binding.mainTabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MainViewPagerAdapter(context, activity!!.supportFragmentManager, binding.mainTabLayout.tabCount)
        binding.mainViewPager.adapter = adapter
        binding.mainViewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                binding.mainTabLayout
            )
        )


        binding.mainTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.mainViewPager.currentItem = tab.position
                //binding.mainTabLayout.setTabIconTintResource(R.drawable.ic_baseline_circle_24)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })



        return binding.getRoot()
    }

}