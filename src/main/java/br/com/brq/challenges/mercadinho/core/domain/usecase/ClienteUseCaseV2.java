package br.com.brq.challenges.mercadinho.core.domain.usecase;

import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;
import br.com.brq.challenges.mercadinho.core.domain.ports.in.ClienteUseCasePort;
import br.com.brq.challenges.mercadinho.core.domain.ports.out.ClientePersistencePort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClienteUseCaseV2 implements ClienteUseCasePort {

    private final ClientePersistencePort clientePersistencePort;

    public ClienteUseCaseV2(ClientePersistencePort clientePersistencePort) {
        this.clientePersistencePort = clientePersistencePort;
    }

    @Override
    public ClienteV2 cadastrarCliente(ClienteV2 cliente) {
        cliente.setId(UUID.randomUUID().toString());
        return clientePersistencePort.criarNovoCliente(cliente);
    }
}
