package com.lenked.facebook.compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = BrandBlue,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = BackgroundGray
)

@Composable
fun Facebook_composeTheme(
    content: @Composable () -> Unit,
) {
    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}


// Facebook_composeTheme