package com.example.consumerestapi.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.consumerestapi.data.KontakRepository
import kotlinx.coroutines.launch

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel() {

    var insertKontakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent: InsertUiEvent) {
        insertKontakState = InsertUiState(insertUiEvent = insertUiEvent)
    }


}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

data class  InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = "",
)
