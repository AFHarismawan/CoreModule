package com.harismawan.coremodule.ui.module

import android.os.Bundle
import com.harismawan.coremodule.R
import com.harismawan.coremodule.ui.base.ConnectionActivity
import com.harismawan.coremodule.util.Util
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_alert.*

class MainActivity : ConnectionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Util.loadImage(this, "https://kotlinlang.org/assets/images/twitter-card/kotlin_800x320.png", demo)
    }

    //example custom dialog implementation
    private fun showAlertDialog() {
        val vv = layoutInflater.inflate(R.layout.dialog_alert, null, false)
        text.text = getString(R.string.error_message_internet)
        buttonOk.setOnClickListener({ dialog.cancel() })

        showDialog(getString(R.string.dialog_alert), vv)
    }

    //example retrofit call implementation
    override fun loadData() {
        if (!Util.isConnected(this))
            showAlertDialog()
            return

        //TODO do your retrofit call here
    }
}
