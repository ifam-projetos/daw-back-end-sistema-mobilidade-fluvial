package br.com.ifam.daw.smf.service.rabbitmq;

import br.com.ifam.daw.smf.model.Compra;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = {"${queue.name}"})
    public void consumer(@Payload Compra compra) {
        System.out.println("mensagem recebida: " + compra);
    }

}
