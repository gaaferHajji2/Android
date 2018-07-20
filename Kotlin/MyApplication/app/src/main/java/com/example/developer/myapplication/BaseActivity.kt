package com.example.developer.myapplication

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_header.*

abstract class BaseActivity : FragmentActivity() {

    protected abstract val tag : String;

    //for optimization
    protected abstract fun getLayout() : Int;

    //for change the title of every screen
    protected abstract fun getActivityTitle():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        //activity_title is id of edit Text in activity_header
        activity_title.setText(getActivityTitle())

        Log.e(tag, "[ON CREATE] of BaseActivity")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        Log.e(tag, "[ON PostCreate] of BaseActivity")
    }

    override fun onResume() {
        super.onResume()

        Log.e(tag, "[ON Resume] of BaseActivity")
    }

    override fun onStart() {
        super.onStart()

        Log.e(tag, "[ON Start] of BaseActivity")
    }

    override fun onPostResume() {
        super.onPostResume()

        Log.e(tag, "[ON Post Resume] of BaseActivity")
    }

    override fun onPause() {
        super.onPause()

        Log.e(tag, "[ON Pause] of BaseActivity")
    }

    override fun onStop() {
        super.onStop()

        Log.i(tag, "[ON Stop] of BaseActivity")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(tag, "[ON Destroy] of BaseActivity")
    }
}