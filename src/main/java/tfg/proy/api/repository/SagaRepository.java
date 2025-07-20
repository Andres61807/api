package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import tfg.proy.api.entity.Saga;

public interface SagaRepository extends JpaRepository<Saga, Long>{

    Saga findBySaga(String saga);
}
