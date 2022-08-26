package com.bloder.kmm_poc.presentation

import kotlinx.coroutines.CoroutineScope
import androidx.lifecycle.ViewModel as AndroidViewModel
import androidx.lifecycle.viewModelScope as androidViewModelScope

actual abstract class ViewModel actual constructor() : AndroidViewModel() {

    actual val viewModelScope: CoroutineScope = androidViewModelScope

    actual override fun onCleared() {
        super.onCleared()
    }
}