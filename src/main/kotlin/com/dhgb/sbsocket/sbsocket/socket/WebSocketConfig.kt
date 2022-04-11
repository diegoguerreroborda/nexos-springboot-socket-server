package com.dhgb.sbsocket.sbsocket.socket

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.config.annotation.*
import org.springframework.web.socket.server.RequestUpgradeStrategy
import org.springframework.web.socket.server.standard.TomcatRequestUpgradeStrategy
import org.springframework.web.socket.server.support.DefaultHandshakeHandler

@Configuration
@EnableWebSocketMessageBroker
class WebSocketConfig: WebSocketMessageBrokerConfigurer {

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        super.registerStompEndpoints(registry)
        println("registry")
        val upgradeStrategy: RequestUpgradeStrategy = TomcatRequestUpgradeStrategy()
        registry.addEndpoint("/ws").withSockJS()
        registry.addEndpoint("/chat").withSockJS()
        registry.addEndpoint("/chat")
                .setHandshakeHandler(DefaultHandshakeHandler(upgradeStrategy))
                .setAllowedOrigins("*")

    }

    override fun configureMessageBroker(config: MessageBrokerRegistry) {
//        super.configureMessageBroker(registry)
        println("config")
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }
}