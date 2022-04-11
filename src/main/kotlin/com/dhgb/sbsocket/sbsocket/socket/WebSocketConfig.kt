package com.dhgb.sbsocket.sbsocket.socket

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.converter.MessageConverter
import org.springframework.messaging.converter.StringMessageConverter
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.web.socket.config.annotation.StompEndpointRegistry
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer
import org.springframework.web.socket.server.RequestUpgradeStrategy
import org.springframework.web.socket.server.standard.TomcatRequestUpgradeStrategy
import org.springframework.web.socket.server.support.DefaultHandshakeHandler


@Configuration
@EnableWebSocketMessageBroker
class WebSocketConfig: WebSocketMessageBrokerConfigurer {

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        println("registry")
        val upgradeStrategy: RequestUpgradeStrategy = TomcatRequestUpgradeStrategy()
        registry.addEndpoint("/ws").withSockJS()
        registry.addEndpoint("/current").withSockJS()
        registry.addEndpoint("/current")
                .setHandshakeHandler(DefaultHandshakeHandler(upgradeStrategy))
                .setAllowedOrigins("*")

    }

    override fun configureMessageBroker(config: MessageBrokerRegistry) {
        println("config")
        config.enableSimpleBroker("/client")
        config.setApplicationDestinationPrefixes("/server")
    }

    override fun configureMessageConverters(messageConverters: MutableList<MessageConverter>): Boolean {
        val strConvertor = StringMessageConverter()
        messageConverters.add(strConvertor)
        return true
    }
}