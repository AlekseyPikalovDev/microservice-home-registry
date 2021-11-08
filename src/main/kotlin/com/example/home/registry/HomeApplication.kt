package com.example.home.registry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HomeApplication

fun main(args: Array<String>) {
    runApplication<HomeApplication>(*args)
    println("START APPLICATION")
}
