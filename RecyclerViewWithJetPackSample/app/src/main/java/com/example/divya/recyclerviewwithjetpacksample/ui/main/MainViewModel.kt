package com.example.divya.recyclerviewwithjetpacksample.ui.main

import android.arch.lifecycle.ViewModel
import com.example.divya.recyclerviewwithjetpacksample.data.users

class MainViewModel : ViewModel() {
    private val userList = users

    fun getUsers() = userList
}
