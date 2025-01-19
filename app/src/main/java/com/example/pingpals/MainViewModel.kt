package com.example.pingpals

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.storage.UserPreferences
import com.example.pingpals.ui.navigation.AppDestinations
import com.example.pingpals.ui.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val navigator: AppNavigator,
    private val userPreferences: UserPreferences
) : ViewModel() {
    val navActions = navigator.navigationChannel
    private val _state = MutableStateFlow(MainScreenState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val initialRoute = when {
                !userPreferences.isIntroShown() -> AppDestinations.intro.path
                else -> null
            }

            _state.value = state.value.copy(initialRoute = initialRoute)
        }
    }
}

data class MainScreenState(
    val initialRoute: String? = null,
)
