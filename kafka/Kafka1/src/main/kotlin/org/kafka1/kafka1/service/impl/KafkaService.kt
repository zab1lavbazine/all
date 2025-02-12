package org.kafka1.kafka1.service.impl

import org.kafka1.kafka1.service.IKafkaService
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaService(
    private val kafkaTemplate: KafkaTemplate<String, Any>
): IKafkaService {

    private val logger = LoggerFactory.getLogger(javaClass)

    private val default_topic = "baeldung"

    override fun publish(message: String) {
        logger.info("Publishing message $message")
        try {
            kafkaTemplate.send(default_topic, message)
        } catch (e: Exception) {
            logger.error("Failed to send message $message", e)
        }
    }
}