package br.com.brq.challenges.mercadinho.entrypoint.mapper;

import br.com.brq.challenges.mercadinho.entrypoint.models.request.ClienteModelRequest;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapperRequest {

    Cliente toDomain(ClienteModelRequest clienteModelRequest);
}
