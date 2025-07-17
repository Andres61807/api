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

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    //Metodos GET 
    @GetMapping("/listado")
    public List<Libro> get(){
        return libroService.getAll();
    }
    /*
    @GetMapping("/listado/genero")
    public List<Libro> getGenero(@RequestBody Genero [] generos){
        return libroService.getGenero(generos);
    }
    
    @GetMapping("/listado/autor")
    public List<Libro> getAutor(@RequestBody Autor [] autores){
        return libroService.getAutor(autores);
    }

    @GetMapping("/listado/{saga}")
    public List<Libro> getSaga(@PathVariable String saga){
        return libroService.getSaga(saga);
    }

    @GetMapping("/{id}")
    public Libro get(@PathVariable int id){
        return libroService.get(id);
    }
     
    @GetMapping("/listado/{precio}")
    public List<Libro> getPrecio(@PathVariable double precio){
        return libroService.getPrecio(precio);
    }
    */
    //Metodos POST 
    @PostMapping
    public Libro create(@RequestBody Libro libro){
        return libroService.create(libro);
    }

    //Metodso PATCH
    @PatchMapping
    public void update(@RequestBody Libro libro){
        libroService.update(libro);
    }

    //Metodos DELETE
    @DeleteMapping
    public void delete(@RequestBody Libro libro){
        libroService.delete(libro);
    }

}
