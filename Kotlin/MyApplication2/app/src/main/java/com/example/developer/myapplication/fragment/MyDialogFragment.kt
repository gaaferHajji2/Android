package com.example.developer.myapplication.fragment

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.developer.myapplication.R

class MyDialogFragment: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view1 = inflater.inflate(R.layout.dialog_fragment_layout1, container, false)

        val x = view1.findViewById(R.id.msg) as TextView;

        x.setText("Gaafer hajji2 is IT Student")

        return view1
    }
}