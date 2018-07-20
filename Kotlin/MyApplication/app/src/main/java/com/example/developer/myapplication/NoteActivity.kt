package com.example.developer.myapplication

class NoteActivity : ItemActivity() {

    override val tag = "ItemActivity"

    override fun getLayout() = R.layout.activity_main

    override fun getActivityTitle() = R.string.app_name
}