package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfg.proy.api.entity.Genero;


public interface GeneroRepository extends JpaRepository<Genero, Long>{

    Genero findByGenero(String genero);

}
