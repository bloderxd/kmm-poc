package com.bloder.kmm_poc.android.di

import androidx.lifecycle.viewmodel.viewModelFactory
import com.bloder.kmm_poc.presentation.animelist.TopItemsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    viewModel { TopItemsViewModel(get()) }
}