package br.com.ifam.daw.smf.controller;

import br.com.ifam.daw.smf.model.Compra;
import br.com.ifam.daw.smf.service.CompraService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<Compra> salvar(@RequestBody @Valid Compra compra) {
        return ResponseEntity.ok(compra);
    }

}
