package com.example.whatsappwithjetpack.data

import com.example.whatsappwithjetpack.domain.ChatsListDataObject
import com.example.whatsappwithjetpack.domain.Message
import com.example.whatsappwithjetpack.domain.MessageType
import com.example.whatsappwithjetpack.domain.MessgeDeliveryStatus

val chatList = listOf<ChatsListDataObject>(
    ChatsListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Virat Kohli"
    ),
    ChatsListDataObject(
        chatId = 2,
        message = Message(
            content = "Hey Tony, how's the suit?",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Captain America"
    ),
    ChatsListDataObject(
        chatId = 3,
        message = Message(
            content = "Just brewing some potions in my spare time.",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.PENDING
        ),
        userName = "Hermione Granger"
    ),
    ChatsListDataObject(
        chatId = 4,
        message = Message(
            content = "What's the latest news from the Ministry?",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.DELIVERED,
            unreadCount = 6
        ),
        userName = "Harry Potter"
    ),
   ChatsListDataObject(
        chatId = 5,
        message = Message(
            content = "What's the plan for defeating Thanos?",
           timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.DELIVERED,
            unreadCount = 4
        ),
        userName = "Black Widow"
    ),
   ChatsListDataObject(
        chatId = 6,
        message = Message(
            content = "I am Groot.",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.READ
        ),
        userName = "Groot"
    ),
    ChatsListDataObject(
        chatId = 7,
        message = Message(
            content = "Lumos!",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.PENDING
        ),
        userName = "Ron Weasley"
    ),
    ChatsListDataObject(
        chatId = 8,
        message = Message(
            content = "I'm Loki of Asgard, and I am burdened with glorious purpose.",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.DELIVERED
        ),
        userName = "Loki"
    ),
    ChatsListDataObject(
        chatId = 9,
        message = Message(
            content = "By the Hoary Hosts of Hoggoth!",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus =MessgeDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Doctor Strange"
    ),
   ChatsListDataObject(
        chatId = 10,
        message = Message(
            content = "Avada Kedavra!",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.READ
        ),
        userName = "Lord Voldemort"
    ),
    ChatsListDataObject(
        chatId = 11,
        message = Message(
            content = "You're a wizard, Harry.",
            timestamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessgeDeliveryStatus.PENDING
        ),
        userName = "Rubeus Hagrid"
    )
)