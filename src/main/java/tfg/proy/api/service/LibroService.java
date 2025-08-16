package tfg.proy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Editorial;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Idioma;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.entity.Saga;
import tfg.proy.api.repository.LibroRepository;
import tfg.proy.api.repository.SagaRepository;
import tfg.proy.api.repository.AutorRepository;
import tfg.proy.api.repository.EditorialRepository;
import tfg.proy.api.repository.GeneroRepository;
import tfg.proy.api.repository.IdiomaRepository;

@Service
@Transactional
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;
    @Autowired 
    private GeneroRepository generoRepository;
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private IdiomaRepository idiomaRepository;
    @Autowired
    private EditorialRepository editorialRepository;
    @Autowired
    private SagaRepository sagaRepository;


    //GET
    //obtiene todos los libros
    public List<Libro> getAll(){
        return libroRepository.findAll();
    }   
    
    //lista todos los libros por una biblioteca
    public List<Libro> getByBiblioteca(Long id){
        return libroRepository.findLibrosByBibliotecaId(id);
    }

    

    //Lista todos los libros por un genero
    public List<Libro> getLibrosGenero(String genero){
        Genero gen=generoRepository.findByGenero(genero);

        return libroRepository.findLibrosByGeneroId(gen.getId());
    }

    //Lista todos los libros de un autor
    public List<Libro> getAutor(String autor){
        Autor aut=autorRepository.findByNombreCompleto(autor);

        return libroRepository.findByAutor(aut.getId());
    }
    
    //Lista todos los libros de un autor
    public List<Libro> getIdioma(String idioma){
        Idioma idiom=idiomaRepository.findByIdioma(idioma);

        return libroRepository.findByIdioma(idiom.getId());
    }

    
    //Lista los libros por editoriales
    public List<Libro> getEditorial(String editorial){
        Editorial edit=editorialRepository.findByNombre(editorial);

        return libroRepository.findByEditorial(edit.getId());
    }

    public List<Libro> getSaga(String saga){
        Saga sag=sagaRepository.findBySaga(saga);

        return libroRepository.findBySaga(sag);
    }

    public Libro get(Long id){
        return libroRepository.findById(id).orElse(null);
    }

    public List<Libro> getPrecio(double precio){
        return  libroRepository.findByPrecioLessThanEqual(precio);
    }

    //POST
    public Libro create(Libro libro){
        return libroRepository.saveAndFlush(libro);
    }

    //PATCH 
    public void update(Libro libro){
        libroRepository.saveAndFlush(libro);
    }

    //DELETE
    public void delete(Libro libro){
        libroRepository.delete(libro);
    }
}
