package tfg.proy.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tfg.proy.api.entity.Libro;
import tfg.proy.api.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    //Metodos GET
    //Listar todos los libros 
    @GetMapping("/listado")
    public List<Libro> get(){
        return libroService.getAll();
    }   
    
    //obtener libros por usuario
    @GetMapping("/listado/biblioteca/{id}")
    public List<Libro> findLibrosByBiblioteca(@PathVariable Long id){
        return libroService.getByBiblioteca(id);
    }

    //obtener libros por editorial
    @GetMapping("listado/editorial/{id}")
    public List<Libro> findLibrosByEditorial(@PathVariable Long id){
        return libroService.getByEditorial(id);
    }

    //obtener libros por id
    @GetMapping("/{id}")
    public Libro get(@PathVariable long id){
        return libroService.get(Long.valueOf(id));
    }

    //Obtener libros por precio
    @GetMapping("/listado/{precio}")
    public List<Libro> getPrecio(@PathVariable double precio){
        return libroService.getPrecio(precio);
    }
    
    //Metodos POST 
    //Crear un libro
    @PostMapping
    public Libro create(@RequestBody Libro libro){
        return libroService.create(libro);
    }
    
    //Metodso PATCH
    //Actualizar un libro
    @PatchMapping
    public void update(@RequestBody Libro libro){
        libroService.update(libro);
    }

    //Metodos DELETE
    //Borrar un libro
    @DeleteMapping
    public void delete(@RequestBody Libro libro){
        libroService.delete(libro);
    }

}
