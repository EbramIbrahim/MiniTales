package com.example.auth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    val state = _state.asStateFlow()

    private val _event = MutableSharedFlow<LoginEvent>()
    val event = _event.asSharedFlow()

    fun onEvent(action: LoginAction) {
        when (action) {
            is LoginAction.EmailChanged -> {
                _state.update { it.copy(email = action.email) }
            }

            is LoginAction.PasswordChanged -> {
                _state.update { it.copy(password = action.password) }
            }

            LoginAction.ForgotPassword -> {
                navigateToForgetPassword()
            }

            LoginAction.Login -> {
                navigateToLogin()
            }

            LoginAction.NavigateToSignupScreen -> {
                navigateToSignupPassword()
            }
        }
    }

    private fun navigateToSignupPassword() = viewModelScope.launch {
        _event.emit(LoginEvent.NavigateToSignupScreenEvent)
    }

    private fun navigateToLogin() = viewModelScope.launch {
        _event.emit(LoginEvent.NavigateToLoginScreenEvent)
    }

    private fun navigateToForgetPassword() = viewModelScope.launch {
        _event.emit(LoginEvent.NavigateToForgetPasswordEvent)
    }


}









