package com.superhero.alfred

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlfredApplication

fun main(args: Array<String>) {
	runApplication<AlfredApplication>(*args)
}
