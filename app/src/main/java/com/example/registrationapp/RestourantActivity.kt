package com.example.registrationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.registrationapp.fragments.ClientFragment
import com.example.registrationapp.fragments.FoodMenuFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class RestourantActivity : AppCompatActivity() {
    private var tab: TabLayout? = null
    private var viewPager: ViewPager2? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restourant)

        tab = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        val fragmentList = listOf(ClientFragment(), FoodMenuFragment())
        viewPager?.apply {
            adapter = object : FragmentStateAdapter(this@RestourantActivity) {
                override fun getItemCount(): Int = fragmentList.size


                override fun createFragment(position: Int): Fragment = fragmentList[position]
            }

            tab?.let {
                TabLayoutMediator(it,this){tab,position->
                    tab.text = "fragment $position"
                }.attach()
            }

        }

    }
}