package br.com.brq.challenges.mercadinho.usecase.service;

import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import br.com.brq.challenges.mercadinho.usecase.gateway.ClienteGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClienteUseCaseImpl implements ClienteUseCase {

    private final ClienteGateway clienteGateway;

    public ClienteUseCaseImpl(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    @Override
    public Cliente cadastrarCliente(Cliente novoCliente) {
        novoCliente.setId(UUID.randomUUID().toString());
        return clienteGateway.criarNovoCliente(novoCliente);
    }
}
