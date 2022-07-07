package br.com.brq.challenges.mercadinho.adapter.out.persistence.mapper;

import br.com.brq.challenges.mercadinho.adapter.out.persistence.entities.ClienteEntityV2;
import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;
import org.mapstruct.Mapper;

@Mapper
public interface ClientePersistenceMapper {

    ClienteEntityV2 toEntity(ClienteV2 clienteV2);
    ClienteV2 toDomain(ClienteEntityV2 clienteEntityV2);
}
