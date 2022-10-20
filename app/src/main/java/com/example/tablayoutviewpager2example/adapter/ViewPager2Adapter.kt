package com.example.tablayoutviewpager2example.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutviewpager2example.fragments.FirstFragment
import com.example.tablayoutviewpager2example.fragments.SecondFragment
import com.example.tablayoutviewpager2example.fragments.ThirdFragment

class ViewPager2Adapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            2 -> {
                ThirdFragment()
            }
            else -> {
                Fragment()
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}