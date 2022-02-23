package ir.masoomi.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Producer {

    private final static String topic = "shop";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void pushToTopic(String message) {
        System.out.println("Publishing to topic: " + topic);
        kafkaTemplate.send(topic, message);
    }

}
