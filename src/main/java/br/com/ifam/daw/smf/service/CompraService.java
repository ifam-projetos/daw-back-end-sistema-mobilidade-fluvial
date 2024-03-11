package br.com.ifam.daw.smf.service;

import br.com.ifam.daw.smf.model.Compra;

import br.com.ifam.daw.smf.repository.CompraRepository;
import br.com.ifam.daw.smf.service.rabbitmq.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class CompraService {

    private final CompraRepository compraRepository;
    private final Producer producer;

    public Compra salvar(Compra compra) {
        compra = compraRepository.save(compra);
        producer.enviarCompra(compra);
        return compra;
    }

}
