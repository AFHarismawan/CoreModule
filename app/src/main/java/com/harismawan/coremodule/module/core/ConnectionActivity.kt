package com.harismawan.coremodule.module.core

import android.annotation.SuppressLint
import com.harismawan.coremodule.data.APIHelper
import com.harismawan.coremodule.data.RetrofitClient
import retrofit2.Call

@SuppressLint("Registered")
abstract class ConnectionActivity : BaseActivity() {

    protected var request: Call<Any>? = null

    //get ApiHelper interface
    protected fun client(): APIHelper? = RetrofitClient.client?.create(APIHelper::class.java)

    //load data from backend
    protected abstract fun loadData()

    //cancel request when activity destroyed
    override fun onDestroy() {
        super.onDestroy()
        request?.cancel()
    }
}
