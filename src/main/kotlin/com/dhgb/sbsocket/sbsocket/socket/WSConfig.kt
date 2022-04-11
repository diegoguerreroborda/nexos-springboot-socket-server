//package com.dhgb.sbsocket.sbsocket.socket
//
////import com.dhgb.sbsocket.sbsocket.controller.Controller
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.web.socket.WebSocketHandler
//import org.springframework.web.socket.config.annotation.EnableWebSocket
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
//import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor
//
//@Configuration
//@EnableWebSocket
//class WSConfig: WebSocketConfigurer {
//
////    @Autowired
////    lateinit var myHandler: MyHandler
//
//    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
//        println("llega a wscofig")
////        registry.addHandler(myHandler, "http://localhost:8081")
////                .setAllowedOrigins( "*" )
////                .addInterceptors(HttpSessionHandshakeInterceptor())
//    }
//
////    @Bean
////    fun myHandler(): WebSocketHandler? {
////        return MyHandler()
////    }
//}