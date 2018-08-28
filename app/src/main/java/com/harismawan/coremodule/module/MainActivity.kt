package com.harismawan.coremodule.module

import android.os.Bundle
import com.harismawan.coremodule.R
import com.harismawan.coremodule.module.core.ConnectionActivity
import com.harismawan.coremodule.util.Utils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_alert.*

class MainActivity : ConnectionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO give example of FlexibleAdapter
        Utils.loadImage(this, "https://kotlinlang.org/assets/images/twitter-card/kotlin_800x320.png", demo)
    }

    //example custom dialog implementation
    private fun showAlertDialog() {
        val vv = layoutInflater.inflate(R.layout.dialog_alert, null, false)
        text.text = getString(R.string.error_message_internet)
        buttonOk.setOnClickListener { dialog.cancel() }

        showDialog(getString(R.string.dialog_alert), vv)
    }

    override fun initialize() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //example retrofit call implementation
    override fun loadData() {
        if (!Utils.isConnected(this))
            showAlertDialog()
            return

        //TODO do your retrofit call here
    }
}
