package com.harismawan.coremodule.module.core

import com.harismawan.coremodule.data.APIHelper
import com.harismawan.coremodule.data.RetrofitClient
import retrofit2.Call

/**
 * @author harismawan.
 * @copyright (c) harismawan
 * @site https://harismawan.com
 */

abstract class ConnectionFragment : BaseFragment() {

    protected var request: Call<Any>? = null

    //get ApiHelper interface
    protected fun client(): APIHelper? = RetrofitClient.client?.create(APIHelper::class.java)

    //load data from backend
    protected abstract fun loadData()

    //cancel request when fragment destroyed
    override fun onDestroy() {
        super.onDestroy()
        request?.cancel()
    }
}