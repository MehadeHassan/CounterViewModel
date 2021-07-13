package dev.mehade.counterviewmodel.pages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val counterLiveDate: LiveData<Int>
        get() = counter

    private val counter = MutableLiveData<Int>()
    private var count = 5

    fun increaseCounter() {
        counter.value = ++count
    }
}
