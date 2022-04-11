package com.dhgb.sbsocket.sbsocket.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController

//Servidor
@RestController
class Controller{

    @MessageMapping("/current")
    @SendTo("/client/messages")
    fun receivedMessage(@Payload message: String): String {
        println("Llegó $message")
        return message
    }

//    @Scheduled(fixedRate = 5000)
//    fun work1() {
//        println("Va a enviar")
//        @SendTo("/topic/messages")
//        fun receivedMessage(): String {
//            println("Va a enviar cada 5 segundos")
//            return "Va a enviar cada 5 segundos"
//        }
//    }
}