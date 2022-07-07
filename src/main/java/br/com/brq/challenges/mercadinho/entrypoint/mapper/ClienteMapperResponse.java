package br.com.brq.challenges.mercadinho.entrypoint.mapper;

import br.com.brq.challenges.mercadinho.entrypoint.models.response.ClienteModelResponse;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapperResponse {

    ClienteModelResponse toModel(Cliente cliente);
}
