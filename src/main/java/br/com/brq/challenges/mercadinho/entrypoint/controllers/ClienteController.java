package br.com.brq.challenges.mercadinho.entrypoint.controllers;

import br.com.brq.challenges.mercadinho.entrypoint.mapper.ClienteMapperRequest;
import br.com.brq.challenges.mercadinho.entrypoint.mapper.ClienteMapperResponse;
import br.com.brq.challenges.mercadinho.entrypoint.models.request.ClienteModelRequest;
import br.com.brq.challenges.mercadinho.entrypoint.models.response.ClienteModelResponse;
import br.com.brq.challenges.mercadinho.usecase.domain.Cliente;
import br.com.brq.challenges.mercadinho.usecase.service.ClienteUseCase;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/clientes")
public class ClienteController {

    private final ClienteMapperRequest clienteMapperRequest = Mappers.getMapper(ClienteMapperRequest.class);
    private final ClienteMapperResponse clienteMapperResponse = Mappers.getMapper(ClienteMapperResponse.class);

    private final ClienteUseCase clienteUseCase;

    public ClienteController(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    @PostMapping
    public ResponseEntity<ClienteModelResponse> criarCliente(@RequestBody ClienteModelRequest clienteModelRequest) {
        Cliente novoCliente = clienteMapperRequest.toDomain(clienteModelRequest);
        Cliente clienteCadastrado = clienteUseCase.cadastrarCliente(novoCliente);
        ClienteModelResponse clienteModelResponse = clienteMapperResponse.toModel(clienteCadastrado);

        return new ResponseEntity<>(clienteModelResponse, HttpStatus.CREATED);
    }
}
