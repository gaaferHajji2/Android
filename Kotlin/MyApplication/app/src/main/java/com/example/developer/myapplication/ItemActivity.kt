package com.example.developer.myapplication

abstract class ItemActivity : BaseActivity() {

    override abstract val tag : String
    override abstract fun getLayout():Int

    override abstract fun getActivityTitle(): Int
}