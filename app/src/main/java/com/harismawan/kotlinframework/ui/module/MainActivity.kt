package com.harismawan.kotlinframework.ui.module

import android.os.Bundle
import com.harismawan.kotlinframework.R
import com.harismawan.kotlinframework.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun loadData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
