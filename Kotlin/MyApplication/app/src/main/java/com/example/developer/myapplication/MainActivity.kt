package com.example.developer.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

import com.example.developer.myapplication.fragment.ItemFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override val tag: String="MainActivity"

    override fun getLayout() = R.layout.activity_main

    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        val fragment = ItemFragment();

        Log.e(tag, "[ON CREATE] of MainActivity using Fragment")

        supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();

        filter_menu.setText("H")

        filter_menu.setOnClickListener{
            val manualFragment = ManualFragment()

            supportFragmentManager.
                    beginTransaction().
                    replace(R.id.fragment_container, manualFragment).
                    addToBackStack("User Manual").//here will save the fragment even when we press back button
                    commit()
        }

        */
        pager.adapter = ViewPagerAdapter(supportFragmentManager);

    }

    private class ViewPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager){
        override fun getItem(position: Int): Fragment {
            return ItemFragment()
        }

        override fun getCount(): Int {
           return 5;
        }
    }
}
