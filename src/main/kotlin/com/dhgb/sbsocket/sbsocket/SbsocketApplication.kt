package com.dhgb.sbsocket.sbsocket

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class SbSocketApplication

fun main(args: Array<String>) {
	runApplication<SbSocketApplication>(*args)
}
