package br.com.brq.challenges.mercadinho.core.application.service;

import br.com.brq.challenges.mercadinho.core.application.dto.ClienteDTO;
import br.com.brq.challenges.mercadinho.core.application.dto.input.ClienteInput;
import br.com.brq.challenges.mercadinho.core.application.mapper.ClienteApplicationMapper;
import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;
import br.com.brq.challenges.mercadinho.core.domain.ports.in.ClienteUseCasePort;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class ClienteApplicationImpl implements ClienteApplication {

    private final ClienteApplicationMapper clienteApplicationMapper = Mappers.getMapper(ClienteApplicationMapper.class);
    private final ClienteUseCasePort clienteUseCasePort;

    public ClienteApplicationImpl(ClienteUseCasePort clienteUseCasePort) {
        this.clienteUseCasePort = clienteUseCasePort;
    }

    @Override
    public ClienteDTO cadastrarNovoClient(ClienteInput clienteInput) {
        ClienteV2 cliente = clienteApplicationMapper.toDomain(clienteInput);
        ClienteV2 novoCliente = clienteUseCasePort.cadastrarCliente(cliente);

        return clienteApplicationMapper.toDto(novoCliente);
    }
}
