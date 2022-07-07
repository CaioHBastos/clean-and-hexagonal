package br.com.brq.challenges.mercadinho.dataprovider.mapper;

import br.com.brq.challenges.mercadinho.dataprovider.entities.ClienteEntity;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteRequestMapper {

    ClienteEntity toEntity(Cliente cliente);
}
