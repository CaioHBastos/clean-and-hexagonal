package br.com.brq.challenges.mercadinho.core.application.mapper;

import br.com.brq.challenges.mercadinho.core.application.dto.ClienteDTO;
import br.com.brq.challenges.mercadinho.core.application.dto.input.ClienteInput;
import br.com.brq.challenges.mercadinho.core.domain.model.ClienteV2;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteApplicationMapper {

    ClienteV2 toDomain(ClienteInput clienteInput);
    ClienteDTO toDto(ClienteV2 clienteV2);
}
