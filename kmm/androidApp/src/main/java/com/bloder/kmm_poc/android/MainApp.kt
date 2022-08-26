package com.bloder.kmm_poc.android

import android.app.Application
import com.bloder.kmm_poc.android.di.appModule
import com.bloder.kmm_poc.di.initDI

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initDI(appModule = appModule)
    }
}