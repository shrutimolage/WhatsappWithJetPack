package com.example.whatsappwithjetpack.domain

import com.example.whatsappwithjetpack.R
import java.sql.Timestamp

data class ChatsListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_user,

    )


data class Message(
    val content: String,
    val deliveryStatus: MessgeDeliveryStatus,
    val type: MessageType,
    val timestamp: String,
    val unreadCount: Int? = null
)


enum class MessgeDeliveryStatus {
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

enum class MessageType {
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE

}