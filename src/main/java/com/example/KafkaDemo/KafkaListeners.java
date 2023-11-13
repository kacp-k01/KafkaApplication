package com.example.KafkaDemo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kajtoTopic", groupId = "groupId")
    void listnere(String data){

        System.out.println("Listnere recieved: "+data+ ":)");

    }

}
