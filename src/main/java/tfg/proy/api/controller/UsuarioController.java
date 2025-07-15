package tfg.proy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tfg.proy.api.entity.Usuario;
import tfg.proy.api.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;


    //GET

    @GetMapping("/{id}")
    public Usuario get(@PathVariable int id){
        //TODO - añadir service
        return new Usuario();
    }

    
    @GetMapping ("/{usuario}")
    public Usuario get(@RequestBody Usuario usuario){
        //TODO - añadir service
        return new Usuario();
    }
}
