package io.github.pedritof.service;

import io.github.pedritof.model.Cliente;
import io.github.pedritof.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    ClientesRepository clientesRepository;

    public void salvarCliente(Cliente cliente) {
        validarCleinte(cliente);
        clientesRepository.persistir(cliente);
    }

    public void validarCleinte(Cliente cliente) {

    }
}
