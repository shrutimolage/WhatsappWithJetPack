package com.example.whatsappwithjetpack.ui.theme.Screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappwithjetpack.data.chatList
import com.example.whatsappwithjetpack.domain.ChatsListDataObject
import com.example.whatsappwithjetpack.ui.theme.Components.UserDetails
import com.example.whatsappwithjetpack.ui.theme.Components.UserImage

@Composable
fun ChatScrren(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }

        items(chatList) { chatData ->
            ChatListItem(chatData)
        }

   }

}

@Composable
fun ChatListItem(chatData: ChatsListDataObject) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        UserImage(chatData.userImage)
        UserDetails(chatData)
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview(){
    ChatScrren()
}