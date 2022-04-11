package com.dhgb.sbsocket.sbsocket.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController

//Servidor
@RestController
class Controller{

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    fun receivedMessage(@Payload message: String): String {
        println("Llegó $message")
        return message
    }
}