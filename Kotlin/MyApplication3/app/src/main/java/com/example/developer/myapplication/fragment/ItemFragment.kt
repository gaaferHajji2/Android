package com.example.developer.myapplication.fragment

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.developer.myapplication.NoteActivity
import com.example.developer.myapplication.R;
import com.example.developer.myapplication.TodoActivity
import com.example.developer.myapplication.model.MODE

class ItemFragment : BaseFragment() {
    override val logTag = "Item Fragment"
    override fun getLayout() = R.layout.fragment_items;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(getLayout(), container, false);
        val btn  = view?.findViewById<FloatingActionButton>(R.id.new_item)

        btn?.setOnClickListener {
            val items = arrayOf(
                    getString(R.string.notes),
                    getString(R.string.todos)
            )

            val builder = AlertDialog.Builder(this@ItemFragment.requireContext()).
                                        setTitle(R.string.choose_a_one).setItems(items, {
                _, which->
                when(which){
                    0->{
                        openCreateTodo();
                    }
                    1->{
                        openCreateNote()
                    }
                    else -> Log.e(logTag, "UnKnown options Selected [$which]")
                }
            })

            builder.show()
        }
        return view;
    }

    private fun openCreateTodo(){
        val intent = Intent(context, TodoActivity::class.java)
        intent.putExtra(MODE.EXTRAS_KEY, MODE.CREATE)
        startActivity(intent)
    }

    private fun openCreateNote(){
        val intent = Intent(context, NoteActivity::class.java)
        intent.putExtra(MODE.EXTRAS_KEY, MODE.CREATE)
        startActivity(intent)
    }

}

