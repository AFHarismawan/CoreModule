package com.harismawan.kotlinframework.ui.base

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import com.harismawan.kotlinframework.data.APIHelper
import com.harismawan.kotlinframework.data.RetrofitClient


@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    /*
    get ApiHelper interface
    */
    fun getAPIHelper(): APIHelper? = RetrofitClient.client?.create(APIHelper::class.java)

    /*
    load data from backend / local storage
    */
    abstract fun loadData()
}