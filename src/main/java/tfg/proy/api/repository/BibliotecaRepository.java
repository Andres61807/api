package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Biblioteca;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca,Long>{
    
}
