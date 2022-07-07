package br.com.brq.challenges.mercadinho.adapter.in.web;

import br.com.brq.challenges.mercadinho.core.application.dto.ClienteDTO;
import br.com.brq.challenges.mercadinho.core.application.dto.input.ClienteInput;
import br.com.brq.challenges.mercadinho.core.application.service.ClienteApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/clientes")
public class ClienteAdapterWeb {

    private final ClienteApplication clienteApplication;

    public ClienteAdapterWeb(ClienteApplication clienteApplication) {
        this.clienteApplication = clienteApplication;
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> criarNovoCliente(@RequestBody ClienteInput clienteInput) {
        ClienteDTO clienteDTO = clienteApplication.cadastrarNovoClient(clienteInput);
        return new ResponseEntity<>(clienteDTO, HttpStatus.CREATED);
    }
}
