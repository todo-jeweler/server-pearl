package com.jeweler.a

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AApplication

fun main(args: Array<String>) {
    runApplication<AApplication>(*args)
}
