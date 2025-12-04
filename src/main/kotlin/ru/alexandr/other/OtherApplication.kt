package ru.alexandr.other

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OtherApplication

fun main(args: Array<String>) {
    runApplication<OtherApplication>(*args)
}
