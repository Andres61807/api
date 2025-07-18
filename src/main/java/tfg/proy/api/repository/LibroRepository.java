package tfg.proy.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

    List<Libro> findByGeneros(List<Genero> generos);
} 
