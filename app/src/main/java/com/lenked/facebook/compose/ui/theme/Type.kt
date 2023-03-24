package com.lenked.facebook.compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lenked.facebook.compose.R

// Set of Material typography styles to start with
val fbFont = FontFamily(
    listOf(
        Font(R.font.facebook)
    )
)

val Typography = Typography(
    h6 = TextStyle(
        fontFamily = fbFont,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        color = BrandBlue
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )
)
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

