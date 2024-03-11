package br.com.ifam.daw.smf.service.rabbitmq;

import br.com.ifam.daw.smf.model.Compra;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class Producer {

    @Autowired
    private final RabbitTemplate rabbitTemplate;
    @Autowired
    private final Queue queue;

    @PostMapping
    public void enviarCompra(Compra compra) {
        rabbitTemplate.convertAndSend(queue.getName(), compra);
    }

}
