package com.example.auth.login

data class LoginState(
    val email: String = "",
    val password: String = "",
    val emailError: Int? = null,
    val passwordError: Int? = null,
    val loginInProgress: Boolean = false,
)
