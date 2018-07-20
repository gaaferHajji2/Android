package com.example.developer.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.developer.myapplication.fragment.MyDialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_fragment_layout1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_dialog.setOnClickListener {
            var d = MyDialogFragment()



            d.show(supportFragmentManager, "Dialog 1")
        }
    }
}
