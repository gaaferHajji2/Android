package com.example.developer.myapplication

import android.os.Bundle
import android.util.Log
import com.example.developer.myapplication.model.MODE

abstract class ItemActivity : BaseActivity() {

    protected var mode = MODE.VIEW;

    override abstract val tag : String
    override abstract fun getLayout():Int

    override abstract fun getActivityTitle(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val modeToSet = intent.getIntExtra(MODE.EXTRAS_KEY, MODE.VIEW.mode);

        mode = MODE.getByValue(modeToSet);

        Log.v(tag, "MODE [$mode] in ON CREATE of Item Activity")


    }
}