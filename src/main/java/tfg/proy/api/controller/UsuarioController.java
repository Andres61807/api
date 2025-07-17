package tfg.proy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        return usuarioService.get(id);
    }

    @GetMapping
    public Usuario get(@RequestBody Usuario usuario){
        return usuarioService.get(usuario);
    }

    @GetMapping("/login")
    public Usuario get(@PathVariable String usuario){
        return usuarioService.get(usuario);
    }
     
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @PatchMapping
    public void update(@RequestBody Usuario usuario){
        usuarioService.update(usuario);
    }

    @DeleteMapping
    public void delete(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
    }
}
