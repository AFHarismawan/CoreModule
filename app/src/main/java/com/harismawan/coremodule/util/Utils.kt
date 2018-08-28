package com.harismawan.coremodule.util

import android.content.Context
import android.net.ConnectivityManager
import android.widget.ImageView
import com.bumptech.glide.Glide

class Utils {

    companion object {

        //check is context connected to internet
        fun isConnected(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            return netInfo != null && netInfo.isConnectedOrConnecting
        }

        //load image from uri
        fun loadImage(context: Context, uri: String, view: ImageView) {
            Glide.with(context).load(uri).into(view)
        }
    }
}