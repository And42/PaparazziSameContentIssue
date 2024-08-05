package com.example.paparazzisamecontentissue

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyNiceVerticalLineComponent() {
    Spacer(
        modifier = Modifier
            .width(1.dp)
            .height(4.dp)
            .background(Color.Red)
    )
}

@Composable
fun MyNiceHorizontalLineComponent() {
    Spacer(
        modifier = Modifier
            .width(4.dp)
            .height(1.dp)
            .background(Color.Red)
    )
}

@Composable
fun MyNiceSquareComponent() {
    Spacer(
        modifier = Modifier
            .width(2.dp)
            .height(2.dp)
            .background(Color.Red)
    )
}