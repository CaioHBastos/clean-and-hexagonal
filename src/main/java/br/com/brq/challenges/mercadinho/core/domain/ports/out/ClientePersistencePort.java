package br.com.brq.challenges.mercadinho.core.domain.ports.out;

import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;

public interface ClientePersistencePort {

    ClienteV2 criarNovoCliente(ClienteV2 clienteV2);
}
