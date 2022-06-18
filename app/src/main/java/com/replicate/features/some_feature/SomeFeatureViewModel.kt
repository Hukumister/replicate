package com.replicate.features.some_feature

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SomeFeatureViewModel : ViewModel() {

    private val _test = MutableStateFlow("Hello world")
    val text: StateFlow<String> = _test

    override fun onCleared() {
        super.onCleared()
        Log.d("SomeFeatureViewModel", "onCleared()")
    }
}
