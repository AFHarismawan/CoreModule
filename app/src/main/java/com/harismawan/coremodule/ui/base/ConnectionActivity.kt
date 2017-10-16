package com.harismawan.coremodule.ui.base

import android.annotation.SuppressLint
import com.harismawan.coremodule.data.APIHelper
import com.harismawan.coremodule.data.RetrofitClient

@SuppressLint("Registered")
abstract class ConnectionActivity : BaseActivity() {

    //get ApiHelper interface
    protected fun getAPIHelper(): APIHelper? = RetrofitClient.client?.create(APIHelper::class.java)

    //load data from backend
    abstract protected fun loadData()
}
