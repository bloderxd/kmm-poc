package com.bloder.kmm_poc.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initDI(appModule: Module) : KoinApplication = startKoin {
    modules(
        coreModule,
        appModule
    )
}