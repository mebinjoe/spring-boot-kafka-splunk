package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApacheKafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "sample_topic_to_send";

    public void send(String message) {
        kafkaTemplate.send(kafkaTopic, message);
    }

}
