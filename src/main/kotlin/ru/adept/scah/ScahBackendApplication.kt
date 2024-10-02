package ru.adept.scah

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScahBackendApplication

fun main(args: Array<String>) {
	runApplication<ScahBackendApplication>(*args)
}
