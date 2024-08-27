package com.example.whatsappwithjetpack.ui.theme.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CircularPoint(unreadCount: String, backgroundColor: Color, textColor: Color) {
        Text(
            text = unreadCount.toString(),
            modifier = Modifier
                .padding(4.dp)
                .size(16.dp)
                .clip(CircleShape)
                .background(backgroundColor),
            style = TextStyle(color = MaterialTheme.colorScheme.primary),
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )

    }
