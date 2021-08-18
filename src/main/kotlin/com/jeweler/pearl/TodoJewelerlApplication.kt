package com.jeweler.pearl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoJewelerApplication

fun main(args: Array<String>) {
    runApplication<TodoJewelerApplication>(*args)
}
