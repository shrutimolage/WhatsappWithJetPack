package com.example.whatsappwithjetpack.data

data class TabData(val tittle:String,val unreadCount:Int?)




val tabs= listOf(
    TabData(tittle = Tabs.CHATS.value,unreadCount=5),
    TabData(tittle = Tabs.STATUS.value,unreadCount=null),
    TabData(tittle = Tabs.CALLS.value,unreadCount=4)
)


enum class Tabs(val value:String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
const val INITIAL_SCREEN_INDEX=0
