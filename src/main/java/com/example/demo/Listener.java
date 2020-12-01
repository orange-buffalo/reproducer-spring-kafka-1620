package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "foo")
    public void onEvent() {

    }

    @KafkaListener(topics = "foo2")
    public void onEvent2() {

    }

    @KafkaListener(topics = "foo3")
    public void onEvent3() {

    }

    @KafkaListener(topics = "foo4")
    public void onEvent4() {

    }

    @KafkaListener(topics = "foo5")
    public void onEvent5() {

    }

    @KafkaListener(topics = "foo6")
    public void onEvent6() {

    }

    @KafkaListener(topics = "foo7")
    public void onEvent7() {

    }

    @KafkaListener(topics = "foo8")
    public void onEvent8() {

    }
}
