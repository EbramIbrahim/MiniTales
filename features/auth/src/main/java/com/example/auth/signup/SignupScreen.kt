package com.example.auth.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.auth.R
import com.example.theme.component.AppTextField
import com.example.theme.ui.MiniTalesTheme


@Composable
fun SignupScreen() {
    Signup()
}


@Composable
fun Signup() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
    ) {

        Icon(
            painter = painterResource(R.drawable.mini_tales),
            contentDescription = "",
            modifier = Modifier.align(
                Alignment.CenterHorizontally
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        AppTextField(
            value = "Abram Ibrahim",
            label = R.string.name,
            onValueChanged = {
            },
            leadingIcon = Icons.Outlined.AccountCircle,
            imeAction = ImeAction.Next,
        )


        AppTextField(
            value = "123456",
            label = R.string.password,
            onValueChanged = {
            },
            leadingIcon = Icons.Outlined.Lock,
            imeAction = ImeAction.Next,
        )
        AppTextField(
            value = "123456",
            label = R.string.repeatPassword,
            onValueChanged = {
            },
            leadingIcon = Icons.Outlined.Lock,
            imeAction = ImeAction.Next,
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(text = "Sign up", style = MaterialTheme.typography.titleMedium)
        }

    }
}


@Preview
@Composable
private fun SignupScreenPrev() {
    MiniTalesTheme {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(MaterialTheme.colorScheme.background)
                .innerShadow(
                    shape = RoundedCornerShape(20.dp),
                    shadow = Shadow(
                        radius = 10.dp,
                        spread = 6.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        offset = DpOffset(x = 4.dp, y = 4.dp)
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text("Drop Shadow")
        }
    }
}









