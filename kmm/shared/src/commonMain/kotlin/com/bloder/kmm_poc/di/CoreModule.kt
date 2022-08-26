package com.bloder.kmm_poc.di

import com.bloder.kmm_poc.data.TopItemsRepository
import com.bloder.kmm_poc.data.TopItemsRepositoryDependency
import com.bloder.kmm_poc.domain.FetchTopItemsUseCase
import com.bloder.kmm_poc.network.animelist.AnimeListNetwork
import kotlinx.coroutines.Dispatchers
import org.koin.core.module.Module
import org.koin.dsl.module

val coreModule: Module = module {
    single<AnimeListNetwork> { AnimeListNetwork }
    single<TopItemsRepository> { TopItemsRepositoryDependency(get(), Dispatchers.Default) }
    single { FetchTopItemsUseCase(get()) }
}