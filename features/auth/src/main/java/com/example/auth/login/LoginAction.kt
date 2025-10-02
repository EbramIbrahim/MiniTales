package com.example.auth.login

sealed interface LoginAction {
    data class EmailChanged(val email: String) : LoginAction
    data class PasswordChanged(val password: String) : LoginAction
    object Login : LoginAction
    object ForgotPassword : LoginAction
    object NavigateToSignupScreen: LoginAction
}



sealed interface LoginEvent {
    object NavigateToSignupScreenEvent: LoginEvent
    object NavigateToLoginScreenEvent: LoginEvent
    object NavigateToForgetPasswordEvent: LoginEvent
}