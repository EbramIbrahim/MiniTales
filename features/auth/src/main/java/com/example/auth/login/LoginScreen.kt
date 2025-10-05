package com.example.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.auth.R
import com.example.theme.component.AppTextField


@Composable
fun LoginScreen(loginViewModel: LoginViewModel) {
    val loginState = loginViewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        loginViewModel.event.collect {
            when (it) {
                LoginEvent.NavigateToForgetPasswordEvent -> TODO()
                LoginEvent.NavigateToLoginScreenEvent -> TODO()
                LoginEvent.NavigateToSignupScreenEvent -> TODO()
            }
        }
    }
    Login(
        loginState = loginState.value,
        onAction = loginViewModel::onEvent
    )
}


@Composable
fun Login(
    loginState: LoginState,
    onAction: (LoginAction) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Icon(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            painter = painterResource(R.drawable.mini_tales),
            contentDescription = "mini tales logo"
        )

        Spacer(modifier = Modifier.height(8.dp))

        AppTextField(
            value = loginState.email,
            label = R.string.email,
            hint = "Add your email",
            onValueChanged = {
                onAction(LoginAction.EmailChanged(it))
            },
            leadingIcon = Icons.Outlined.Email,
            imeAction = ImeAction.Next,
        )

        AppTextField(
            value = loginState.password,
            label = R.string.password,
            hint = "Add your password",
            onValueChanged = {
                onAction(LoginAction.PasswordChanged(it))
            },
            leadingIcon = Icons.Outlined.Lock,
            imeAction = ImeAction.Done,
            isPasswordField = true
        )

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {

                Text(
                    text = "Forgot Password",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Click here to reset",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }


            Button(
                modifier = Modifier.weight(1f),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = ""
                )
            }
        }

        Spacer(modifier = Modifier.height(26.dp))

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Don't have an account, Signup",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        )


    }
}


@Preview
@Composable
private fun LoginScreenPreview() {
    Login(
        LoginState()
    ) { }
}












