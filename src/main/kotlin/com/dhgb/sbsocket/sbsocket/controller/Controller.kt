package com.dhgb.sbsocket.sbsocket.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.web.bind.annotation.RestController

//Server
@RestController
@EnableScheduling
class Controller{

    @Autowired
    private lateinit var messagingTemplate: SimpMessagingTemplate

    @MessageMapping("/current")
//    @SendTo("/client/messages")
    fun receivedMessage(@Payload message: String) = println("Get: $message")

    @Scheduled(fixedDelay = 15000)
    fun subscribeServer() =
            this.messagingTemplate.convertAndSend(
                    "/client/messages", "Message: each 15 seconds")
}