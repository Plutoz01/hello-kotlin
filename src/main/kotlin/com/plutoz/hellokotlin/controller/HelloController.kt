package com.plutoz.hellokotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api/v1/hello")
class HelloController {
    @GetMapping
    fun hello(): Mono<String> {
        return Mono.just("Hello Kotlin!")
    }
}