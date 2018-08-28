package com.harismawan.coremodule.config

import com.harismawan.coremodule.BuildConfig

class Constant {

    companion object {

        //backend server base url
        const val baseUrl = "<base_url>"

        //example secured apiKey stored on gradle.properties file
        val apiKey = BuildConfig.apiKey
    }
}
