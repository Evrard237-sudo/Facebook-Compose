package com.lenked.facebook.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class HomeScreenState{
    object Loading: HomeScreenState()
    object SignInRequired : HomeScreenState()
    data class Loaded(
        val avatarUrl: String
    ) : HomeScreenState()
}

class HomeScreenViewModel : ViewModel() {
    private val mutableState = MutableStateFlow<HomeScreenState>(
        HomeScreenState.Loading
    )
    val state = mutableState.asStateFlow()

    init {
        viewModelScope.launch {
            // Verifie si l'utilisateur est connecter
            mutableState.emit(
                HomeScreenState.SignInRequired
            )
        }
    }
}
