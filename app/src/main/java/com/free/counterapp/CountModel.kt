package com.free.counterapp

data class CountModel(var count: Int)

class CountRepository{
    private var _counter = CountModel(0)

    fun getCounter(): CountModel{
        return _counter
    }

    fun increment(){
        _counter.count++
    }
    fun decrement(){
        _counter.count--
    }
}
