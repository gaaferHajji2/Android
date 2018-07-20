package com.example.developer.myapplication

class TodoActivity : ItemActivity() {
    override val tag = "TodoActivity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

}