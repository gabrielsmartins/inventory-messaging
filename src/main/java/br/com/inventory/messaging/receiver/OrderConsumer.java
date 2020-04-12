package br.com.inventory.messaging.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@Slf4j
@EnableBinding(Sink.class)
public class OrderConsumer {

    @StreamListener(target = Sink.INPUT)
    public void receive(String message){
        log.info("Receiving message: {}", message);
    }
}
