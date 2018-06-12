package com.example.divya.recyclerviewwithjetpacksample.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.divya.recyclerviewwithjetpacksample.R
import com.example.divya.recyclerviewwithjetpacksample.adapters.CategoryAdapter

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var manager : StaggeredGridLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val adapter = CategoryAdapter(viewModel.getUsers(), view.context)
        manager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        manager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
        view.findViewById<RecyclerView>(R.id.category_list).layoutManager = manager
        view.findViewById<RecyclerView>(R.id.category_list).adapter = adapter
        return view

    }


}
