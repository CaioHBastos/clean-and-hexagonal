package br.com.brq.challenges.mercadinho.dataprovider.service;

import br.com.brq.challenges.mercadinho.dataprovider.entities.ClienteEntity;
import br.com.brq.challenges.mercadinho.dataprovider.mapper.ClienteRequestMapper;
import br.com.brq.challenges.mercadinho.dataprovider.mapper.ClienteResponseMapper;
import br.com.brq.challenges.mercadinho.dataprovider.repository.ClienteRepository;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import br.com.brq.challenges.mercadinho.usecase.gateway.ClienteGateway;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class ClienteServiceImpl implements ClienteGateway {

    private final ClienteRequestMapper clienteV2RequestMapper = Mappers.getMapper(ClienteRequestMapper.class);

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente criarNovoCliente(Cliente novoCliente) {
        ClienteEntity novoClienteEntity = clienteV2RequestMapper.toEntity(novoCliente);
        ClienteEntity clienteEntityCadastrado = clienteRepository.save(novoClienteEntity);

        return ClienteResponseMapper.toDomain(clienteEntityCadastrado);
    }
}
