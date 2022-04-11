package com.dhgb.sbsocket.sbsocket.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.web.bind.annotation.RestController

//Servidor
@RestController
@EnableScheduling
class Controller{

    @Autowired
    private lateinit var messagingTemplate: SimpMessagingTemplate

    @Scheduled(fixedDelay = 20000)
    fun alarm() =
        sendMessage("Message: each 20 seconds")

    @MessageMapping("/current")
//    @SendTo("/client/messages")
    fun receivedMessage(@Payload message: String) =
        println("Get: $message")

    fun sendMessage(@Payload message: String) =
            this.messagingTemplate.convertAndSend("/client/messages", message)
}