package com.example.whatsappwithjetpack.ui.theme.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CallsScrren(){
    Column (modifier = Modifier.fillMaxSize()){
        Text(text = "Calls Screen")

    }

}

@Preview(showBackground = true)
@Composable
fun CallsScreenPreview(){
    CallsScrren()
}