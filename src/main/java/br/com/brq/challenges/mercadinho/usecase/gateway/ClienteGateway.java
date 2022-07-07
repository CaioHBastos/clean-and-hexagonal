package br.com.brq.challenges.mercadinho.usecase.gateway;

import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;

public interface ClienteGateway {

    Cliente criarNovoCliente(Cliente novoCliente);
}
