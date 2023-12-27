package com.example.consumerestapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.KontakApplication
import com.example.consumerestapi.ui.home.viewmodel.HomeViewModel
import com.example.consumerestapi.data.KontakRepository


object PenyediaViewModel {
    val Factory = viewModelFactory {


        initializer {
            HomeViewModel(apkikasiKontak().container.kontakRepository)
        }

    }
}

fun CreationExtras.apkikasiKontak(): KontakApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)