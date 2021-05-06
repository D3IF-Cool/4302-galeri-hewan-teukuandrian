package com.teukuandrian.galerihewan.ui.main

import android.util.Log
import org.d3if2090.galerihewan.R

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    private val status = MutableLiveData<ApiStatus>()
    init {
        retrieveData()
    }
    private fun retrieveData() {
        viewModelScope.launch {
            status.value = ApiStatus.LOADING
            try {

                )
                data.value = HewanApi.service.getHewan()
            }
            catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
                status.value = ApiStatus.FAILED

            }
        }
    }
    ..
    // Data ini akan kita ambil dari server di langkah selanjutnya


    fun getData(): LiveData<List<Hewan>> = data
    fun getStatus(): LiveData<ApiStatus> = status
}