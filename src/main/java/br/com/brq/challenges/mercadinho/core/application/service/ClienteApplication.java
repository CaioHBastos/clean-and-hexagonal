package br.com.brq.challenges.mercadinho.core.application.service;

import br.com.brq.challenges.mercadinho.core.application.dto.ClienteDTO;
import br.com.brq.challenges.mercadinho.core.application.dto.input.ClienteInput;

public interface ClienteApplication {

    ClienteDTO cadastrarNovoClient(ClienteInput clienteInput);
}
