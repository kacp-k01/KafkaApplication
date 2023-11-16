package com.example.KafkaDemo;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessageControllerClass {

    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("baseTopic",request.message());

    }
}
