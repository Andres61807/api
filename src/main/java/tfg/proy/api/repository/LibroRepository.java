package tfg.proy.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Idioma;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.entity.Saga;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

    List<Libro> findByGeneros(List<Genero> generos);
    List<Libro> findByAutores(List<Autor> autor);
    List<Libro> findByIdiomas(List<Idioma> idioma);
    List<Libro> findBySaga(Saga saga);
    List<Libro> findByPrecioLessThanEqual(double precio);
} 
