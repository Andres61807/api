package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long>{

    Editorial findByNombre(String Nombre);
}
