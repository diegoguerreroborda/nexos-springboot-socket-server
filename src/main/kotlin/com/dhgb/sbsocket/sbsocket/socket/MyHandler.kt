//package com.dhgb.sbsocket.sbsocket.socket
//
//import com.fasterxml.jackson.databind.ObjectMapper
//import org.springframework.stereotype.Component
//import org.springframework.web.socket.CloseStatus
//import org.springframework.web.socket.TextMessage
//import org.springframework.web.socket.WebSocketSession
//import org.springframework.web.socket.handler.TextWebSocketHandler
//import java.io.IOException
//
//@Component
//class MyHandler: TextWebSocketHandler() {
//
//    @Throws(InterruptedException::class, IOException::class)
//    public override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
//        val message = message.payload + " World"
//        session.sendMessage(TextMessage(message))
//    }
//
//    @Throws(Exception::class)
//    override fun afterConnectionEstablished(session: WebSocketSession) { //the messages will be broadcasted to all users.
//        println("received connection")
//    }
//
//    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
//        super.afterConnectionClosed(session, status)
//        println("Connection closed by client")
//    }
//
////    public override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
//////        super.handleTextMessage(session, message)
////        println("Llega del socket $message")
////        val json = ObjectMapper().readTree(message.payload)
////        when(json.get("type").asText()){
////            "join" -> {
////
////            }
////            "say" -> {
////
////            }
////        }
////    }
//}