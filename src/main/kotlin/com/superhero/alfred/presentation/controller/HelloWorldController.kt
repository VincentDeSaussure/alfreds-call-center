package com.superhero.alfred.presentation.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    data class Hello(val message: String)

    @GetMapping("/hello")
    fun hello(): ResponseEntity<*> {
        return ResponseEntity.ok(
                Hello(message = "message")
        )
    }


}
