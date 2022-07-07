package br.com.brq.challenges.mercadinho.adapter.out.persistence.repositories;

import br.com.brq.challenges.mercadinho.adapter.out.persistence.entities.ClienteEntityV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositoryV2 extends JpaRepository<ClienteEntityV2, String> {

}
