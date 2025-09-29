package com.example.theme.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.example.theme.ui.MiniTalesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarUi(
    title: String,
    navIcon: ImageVector?,
    onNavClick: () -> Unit,
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = { Text(text = title) },
        navigationIcon = {
            navIcon?.let {
                IconButton(onClick = onNavClick) {
                    Icon(
                        imageVector = it,
                        contentDescription = "Navigation Icon"
                    )
                }
            }
        }
    )
}


@PreviewLightDark
@Composable
private fun AppBarPrev() {
    MiniTalesTheme {
        AppBarUi(
            title = "Mini Tales",
            navIcon = Icons.Default.ArrowBack,
            onNavClick = {},
        )
    }

}








