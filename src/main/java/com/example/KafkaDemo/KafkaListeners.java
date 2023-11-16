package com.example.KafkaDemo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "baseTopic", groupId = "groupId")
    void listen(String data) {

        System.out.println("Listener received: " + data + ":)");

    }

}
