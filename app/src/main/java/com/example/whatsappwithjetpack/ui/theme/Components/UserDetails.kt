package com.example.whatsappwithjetpack.ui.theme.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappwithjetpack.domain.ChatsListDataObject
import com.example.whatsappwithjetpack.ui.theme.HighlightGreen

@Composable
fun UserDetails(chatData:ChatsListDataObject){
    Column(modifier = Modifier
        .wrapContentHeight()
        .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center) {
     MessageHeader(chatData)
        MessageSubSection(chatData)
    }

}

@Composable
fun MessageSubSection(chatData: ChatsListDataObject) {
    Row (verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            value = chatData.message.content,
            fontsize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.weight(1f),
            fontweight = FontWeight.SemiBold
        )
        chatData.message.unreadCount?.also {
            CircularPoint(
                unreadCount = it.toString(),
                backgroundColor = HighlightGreen,
                textColor = Color.White
            )
        }
    }

}

@Composable
fun MessageHeader(chatData: ChatsListDataObject) {
    Row (verticalAlignment = Alignment.CenterVertically){
        TextComponent(
            modifier=Modifier.weight(1f),
            value=chatData.userName,
            fontsize=16.sp,
            color= Color.Black,
            fontweight=FontWeight.SemiBold)
        TextComponent(
            chatData.message.timestamp,
            fontsize=12.sp,
            color = if((chatData.message.unreadCount?:0)>0) HighlightGreen else Color.Gray,
            modifier = null,
            FontWeight.SemiBold
        )
    }

}
@Composable
fun MessageSubSectionPreview() {

}

@Composable
fun MessageHeaderPreview() {

}
