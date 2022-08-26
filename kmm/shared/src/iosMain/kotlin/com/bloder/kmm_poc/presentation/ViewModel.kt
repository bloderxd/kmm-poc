package com.bloder.kmm_poc.presentation

import com.bloder.kmm_poc.FlowAdapter
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow

actual abstract class ViewModel {

    actual val viewModelScope = MainScope()

    protected actual open fun onCleared() {}

    fun clear() {
        onCleared()
        viewModelScope.cancel()
    }
}

abstract class CallbackViewModel {
    protected abstract val viewModel: ViewModel

    fun <T : Any> Flow<T>.asCallbacks() =
        FlowAdapter(viewModel.viewModelScope, this)

    @Suppress("Unused")
    fun clear() = viewModel.clear()
}