package com.harismawan.coremodule.application

import android.app.Application
import android.content.Context
import android.graphics.Typeface

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        //TODO implement Realm database

        //change default fonts with fonts/montserrat_regular.ttf on assets folder
        overrideFont(applicationContext, "SERIF", "fonts/montserrat_regular.ttf")
    }

    private fun overrideFont(context: Context, defaultFontNameToOverride: String, customFontFileNameInAssets: String) {
        try {
            val customFontTypeface = Typeface.createFromAsset(context.assets, customFontFileNameInAssets)
            val defaultFontTypefaceField = Typeface::class.java.getDeclaredField(defaultFontNameToOverride)
            defaultFontTypefaceField.isAccessible = true
            defaultFontTypefaceField.set(null, customFontTypeface)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}