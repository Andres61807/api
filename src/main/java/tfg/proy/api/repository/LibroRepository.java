package tfg.proy.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Idioma;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.entity.Saga;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

    @Query("SELECT lg.genero FROM LibroGenero lg WHERE lg.libro.id = :libroId")
    List<Genero> findGenerosByLibroId(@Param("libroId") Long libroId);

    @Query("SELECT lg.libro FROM LibroGenero lg WHERE lg.genero.id = :generoId")
    List<Libro> findLibrosByGeneroId(@Param("generoId") Long generoId);
    
    @Query("SELECT lg.libro FROM LibroAutor lg WHERE lg.autor.id = :autorId")
    List<Libro> findByAutor(@Param("autorId") Long autorId);
    
    @Query("SELECT lg.libro FROM LibroIdioma lg WHERE lg.idioma.id = :idiomaId")
    List<Libro> findByIdioma(@Param("idiomaId") Long idiomaId);
    
    @Query("SELECT lg.libro FROM LibroEditorial lg WHERE lg.editorial.id = :editorialId")
    List<Libro> findByEditorial(@Param("editorialId") Long editorialId);
    
    @Query("SELECT lb.libro FROM LibroBiblioteca lb WHERE lb.biblioteca.id = :bibliotecaId")
    List<Libro> findLibrosByBibliotecaId(@Param("bibliotecaId") Long bibliotecaId);

     @Query("SELECT lb.libro FROM LibroEditorial lb WHERE lb.editorial.id = :editorialId")
    List<Libro> findLibrosByEditorialId(@Param("editorialId") Long bibliotecaId);

    List<Libro> findBySaga(Saga saga);
    
    List<Libro> findByIdiomas(List<Idioma> idioma);

    List<Libro> findByPrecioLessThanEqual(double precio);
} 
