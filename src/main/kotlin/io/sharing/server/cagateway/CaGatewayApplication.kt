package io.sharing.server.cagateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaGatewayApplication

fun main(args: Array<String>) {
    runApplication<CaGatewayApplication>(*args)
}
