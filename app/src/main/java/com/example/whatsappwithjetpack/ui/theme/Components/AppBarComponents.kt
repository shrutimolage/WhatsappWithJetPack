package com.example.whatsappwithjetpack.ui.theme.Components

import android.graphics.drawable.AdaptiveIconDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappwithjetpack.R

@Composable
fun AppBarComponents() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        // verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.whatsApp), style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        IconComponents(R.drawable.ic_camera)
        Spacer(modifier = Modifier.size(20.dp))

        IconComponents(R.drawable.ic_search)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponents(R.drawable.menu)
    }
}


@Composable
@Preview()
fun AppBarComponentsPreview() {
    AppBarComponents()
}


@Composable
fun IconComponents(drawableId: Int) {
    Icon(painter = painterResource(id = drawableId), contentDescription = "",
        tint = MaterialTheme.colorScheme.tertiary)
}
