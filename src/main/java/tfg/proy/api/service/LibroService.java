package tfg.proy.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.repository.LibroRepository;


@Service
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;

    //GET
    public List<Libro> getAll(){
        return libroRepository.findAll();
    }   
    /*
    public List<Libro> getGenero(Genero [] a){
     
        return libros;
    }

    public List<Libro> getAutor(Autor [] a){

        return libros;
    }

    public List<Libro> getSaga(String a){
  
        return libros;
    }

    public Libro get(int id){
        return libroRepository.findById(id).orElse(null);
    }

    public List<Libro> getPrecio(double precio){

        return libros;
    }
    */
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
