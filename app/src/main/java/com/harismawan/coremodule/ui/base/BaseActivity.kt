package com.harismawan.coremodule.ui.base

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.harismawan.coremodule.R
import kotlinx.android.synthetic.main.dialog_header.*

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var dialog: AlertDialog

    //show custom template dialog
    protected fun showDialog(title: String, content: View) {
        val builder = AlertDialog.Builder(this)

        val v = layoutInflater.inflate(R.layout.dialog_header, null, false)
        headerTitle.text = title

        builder.setCustomTitle(v)
        builder.setView(content)

        dialog = builder.create()
        dialog.show()
    }
}