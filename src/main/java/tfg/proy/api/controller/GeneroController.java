package tfg.proy.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tfg.proy.api.entity.Genero;
import tfg.proy.api.service.GeneroService;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    //GET
    @GetMapping
    public List<Genero> get(){
        return generoService.getAll();
    }

    @GetMapping("/{genero}")
    public boolean get(@PathVariable String genero){
        return generoService.get(genero);
    }
}
