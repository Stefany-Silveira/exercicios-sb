package br.com.stefany.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

import br.com.stefany.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.311-00");
    }
}
