package com.example.developer.myapplication.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {
    protected abstract val logTag:String
    protected abstract fun getLayout():Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e(logTag,  "[ON CREATE VIEW] of Base Fragment")
        return inflater.inflate(getLayout(), container, false);
    }

    override fun onResume() {
        Log.e(logTag, "[ON RESUME] of Base Fragment")
        super.onResume()
    }

    override fun onPause() {
        Log.e(logTag, "[ON PAUSE] of Base Fragment")
        super.onPause()
    }

    override fun onDestroy() {
        Log.e(logTag, "[ON DESTROY] of Base Fragment")
        super.onDestroy()
    }
}