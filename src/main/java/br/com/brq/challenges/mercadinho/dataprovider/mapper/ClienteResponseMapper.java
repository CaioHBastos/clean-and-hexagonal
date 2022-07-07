package br.com.brq.challenges.mercadinho.dataprovider.mapper;

import br.com.brq.challenges.mercadinho.dataprovider.entities.ClienteEntity;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;

public class ClienteResponseMapper {

    private ClienteResponseMapper() {
    }

    public static Cliente toDomain(ClienteEntity clienteEntity) {
        return new Cliente(
                clienteEntity.getId(),
                clienteEntity.getNome(),
                clienteEntity.getSobrenome(),
                clienteEntity.getIdade()
        );
    }
}
