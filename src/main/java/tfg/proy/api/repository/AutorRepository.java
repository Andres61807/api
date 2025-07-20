package tfg.proy.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

    Autor findByNombreCompleto(String nombre);
}
