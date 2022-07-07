package br.com.brq.challenges.mercadinho.adapter.out.persistence.service;

import br.com.brq.challenges.mercadinho.adapter.out.persistence.entities.ClienteEntityV2;
import br.com.brq.challenges.mercadinho.adapter.out.persistence.mapper.ClientePersistenceMapper;
import br.com.brq.challenges.mercadinho.adapter.out.persistence.repositories.ClienteRepositoryV2;
import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;
import br.com.brq.challenges.mercadinho.core.domain.ports.out.ClientePersistencePort;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class ClienteAdapterPersistenceImpl implements ClientePersistencePort {

    private final ClientePersistenceMapper clientePersistenceMapper = Mappers.getMapper(ClientePersistenceMapper.class);

    private final ClienteRepositoryV2 clienteRepositoryV2;

    public ClienteAdapterPersistenceImpl(ClienteRepositoryV2 clienteRepositoryV2) {
        this.clienteRepositoryV2 = clienteRepositoryV2;
    }

    @Override
    public ClienteV2 criarNovoCliente(ClienteV2 clienteV2) {
        ClienteEntityV2 clienteEntityV2 = clientePersistenceMapper.toEntity(clienteV2);
        ClienteEntityV2 novoCliente = clienteRepositoryV2.save(clienteEntityV2);

        return clientePersistenceMapper.toDomain(novoCliente);
    }
}
