package br.com.inventory.messaging.receiver;

import br.com.inventory.application.ports.in.orders.SubmitOrderUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

@Slf4j
@EnableBinding(Sink.class)
public class OrderConsumer {

    private SubmitOrderUseCase createOrderUseCase;

    @StreamListener(target = Sink.INPUT)
    public void receive(Message<?> message){
        MessageHeaders headers = message.getHeaders();
        Object payload = message.getPayload();
        log.info("Receiving message ...");
        log.info("Headers: {}", headers);
        log.info("Payload: {}", payload);
    }
}
