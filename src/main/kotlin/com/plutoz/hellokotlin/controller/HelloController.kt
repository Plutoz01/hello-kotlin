package com.plutoz.hellokotlin.controller

import com.plutoz.hellokotlin.domain.Welcome
import com.plutoz.hellokotlin.repository.WelcomeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/hello")
class HelloController(val welcomeRepository: WelcomeRepository) {
    @GetMapping
    fun hello(): String = "Hello Kotlin!"

    @ExperimentalStdlibApi
    @GetMapping("/{name}")
    fun helloName(@PathVariable name: String): String {
        val message: String = welcomeRepository.findAll().randomMessageOrDefault("Greetings");

        return "${message}, ${name}!"
    }

    @ExperimentalStdlibApi
    fun Iterable<Welcome>.randomMessageOrDefault(defaultMessage: String): String =
            toList().randomOrNull()?.message ?: defaultMessage;
}