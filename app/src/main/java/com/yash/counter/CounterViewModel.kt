package com.yash.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel()
{
    private val _count= mutableStateOf(0)

    // An immutable variable to show user that what is the value of count
    val count:MutableState<Int> =_count

    fun increment(){
        _count.value++
    }
    fun decrement(){
        _count.value--
    }
}