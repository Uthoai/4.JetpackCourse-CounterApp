package com.free.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _countRepository: CountRepository = CountRepository()
    private val _count = mutableStateOf(_countRepository.getCounter().count)

    val count: MutableState<Int> get() = _count

    fun increment(){
        _countRepository.increment()
        _count.value = _countRepository.getCounter().count
    }
    fun decrement(){
        _countRepository.decrement()
        _count.value = _countRepository.getCounter().count
    }
}