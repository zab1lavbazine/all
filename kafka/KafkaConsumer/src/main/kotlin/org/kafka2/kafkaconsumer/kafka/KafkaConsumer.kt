package org.kafka2.kafkaconsumer.kafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component


@Component
class KafkaConsumer {


    private val logger = LoggerFactory.getLogger(KafkaConsumer::class.java)

    @KafkaListener(topics = ["baeldung"], groupId = "test-group-id")
    fun consumeMessages(event: String){
        logger.info("Received event: $event")
    }
}