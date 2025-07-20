package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Idioma;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma,Long> {

    Idioma findByIdioma(String idioma);
}
