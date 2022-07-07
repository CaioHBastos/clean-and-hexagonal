package br.com.brq.challenges.mercadinho.core.domain.ports.in;

import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;

public interface ClienteUseCasePort {

    ClienteV2 cadastrarCliente(ClienteV2 cliente);
}
