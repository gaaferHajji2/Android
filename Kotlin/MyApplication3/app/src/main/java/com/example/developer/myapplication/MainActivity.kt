package com.example.developer.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import com.example.developer.myapplication.fragment.ItemFragment
import com.example.developer.myapplication.navigation.NavigationDrawerAdapter
import com.example.developer.myapplication.navigation.NavigationDrawerItem
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : BaseActivity() {
    override val tag: String="MainActivity"

    override fun getLayout() = R.layout.main_activity

    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        setSupportActionBar(toolbar)

        pager.adapter = ViewPagerAdapter(supportFragmentManager);

        Log.e(tag, "[onCreate] MainActivity")

        val menuItems = mutableListOf<NavigationDrawerItem>();

        val today = NavigationDrawerItem(getString(R.string.today), Runnable {
            pager.setCurrentItem(0, true)
        })

        val next7Days = NavigationDrawerItem(getString(R.string.next_7_days), Runnable {
            pager.setCurrentItem(1, true)
        })

        val todos = NavigationDrawerItem(getString(R.string.todos), Runnable {
            pager.setCurrentItem(2, true)
        })

        val notes = NavigationDrawerItem(getString(R.string.notes), Runnable {
            pager.setCurrentItem(3, true)
        })

        menuItems.add(today)
        menuItems.add(next7Days)
        menuItems.add(todos)
        menuItems.add(notes)

        val navigationDrawerAdapter = NavigationDrawerAdapter(this, menuItems)

        left_drawer.adapter = navigationDrawerAdapter;
    }

    private class ViewPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager){
        override fun getItem(position: Int): Fragment {
            return ItemFragment()
        }

        override fun getCount(): Int {
           return 5;
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu);


        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.drawing_menu->{
                Log.v(tag, "Main menu.")
                return true
            }

            R.id.options_menu->{
                Log.v(tag, "Options Menu")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
