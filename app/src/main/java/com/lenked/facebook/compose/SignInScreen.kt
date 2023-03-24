package com.lenked.facebook.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Facebook
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lenked.facebook.compose.ui.theme.Facebook_composeTheme

@Composable
fun SignInScreen() {
    Box(
        Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()) {
        Column(
            Modifier.fillMaxWidth().padding(top = 120.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Rounded.Facebook,
                contentDescription = null,
                modifier = Modifier.size(90.dp),
                tint = MaterialTheme.colors.primary
            )
            Spacer(Modifier.height(20.dp))
            Text(text = "Sign In with Facebook")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultSignInPreview() {
    Facebook_composeTheme {
        SignInScreen()
    }
}
