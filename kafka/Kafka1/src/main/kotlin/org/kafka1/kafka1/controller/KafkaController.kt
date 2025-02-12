package org.kafka1.kafka1.controller

import org.kafka1.kafka1.service.IKafkaService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kafka")
class KafkaController(
    private val kafkaService: IKafkaService
) {

    private val logger = LoggerFactory.getLogger(KafkaController::class.java)

    @PostMapping("/post")
    fun publishNewMessage(@RequestParam message: String): ResponseEntity<String> {
        logger.info("Getting new message $message")
        kafkaService.publish(message)
        return ResponseEntity.ok().body("New message: $message")
    }
}