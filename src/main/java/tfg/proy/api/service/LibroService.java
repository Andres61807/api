package tfg.proy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.entity.Saga;
import tfg.proy.api.repository.LibroRepository;


@Service
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;

    //GET
    public List<Libro> getAll(){
        return libroRepository.findAll();
    }   
    
    public List<Libro> getGenero(List<Genero> a){
        return libroRepository.findByGeneros(a);
    }
    
    public List<Libro> getAutores(List<Autor> a){

        return libroRepository.findByAutores(a);
    }
    
    public List<Libro> getSaga(Saga a){
        
        return libroRepository.findBySaga(a);
    }

    public Libro get(int id){
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
