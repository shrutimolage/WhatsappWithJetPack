package com.example.whatsappwithjetpack.ui.theme.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(
    value: String,
    fontsize: TextUnit,
    color: Color,
    modifier: Modifier?,
    fontweight: FontWeight?= FontWeight.Normal
) {
    if (modifier != null) {
        Text(
            text = value,
            modifier = modifier,
            style = TextStyle(
                fontSize = fontsize,
                fontWeight = fontweight,
                color = color
            )
        )
    } else {
        Text(

            text = value,
            style = TextStyle(
                fontSize = fontsize,
                fontWeight = fontweight,
                color = color
            )
        )

    }
}