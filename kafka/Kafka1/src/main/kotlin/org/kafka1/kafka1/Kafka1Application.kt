package org.kafka1.kafka1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class Kafka1Application

fun main(args: Array<String>) {
    runApplication<Kafka1Application>(*args)
}
