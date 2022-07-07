package br.com.brq.challenges.mercadinho.dataprovider.repository;

import br.com.brq.challenges.mercadinho.dataprovider.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, String> {

}
