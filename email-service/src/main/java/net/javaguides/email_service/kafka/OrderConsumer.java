package net.javaguides.email_service.kafka;

import net.javaguides.base_domains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger  LOOGER = LoggerFactory.getLogger(OrderConsumer.class);
    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            , groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(OrderEvent event){
        LOOGER.info(String.format("Order event received in email service => %s", event.toString()));
        // SEND THE EMAIL TO THE CUSTOMER

    }
}
