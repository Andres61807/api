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
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    //GET
    //Obtener usuario por id
    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id){
        return usuarioService.get(id);
    }
    
    //comprobar que el usuario o el correo no esten ya registrados   
    @GetMapping("/credenciales/{usuario}")
    public Usuario getCredenciales(@PathVariable String usuario){
        return usuarioService.getCredenciales(usuario);
    }

    //comprobar los datos de login del usuario
    @GetMapping("/login/{usuario}/{pass}")
    public Usuario getLogin(@PathVariable String usuario,@PathVariable String pass){
        return usuarioService.getLogin(usuario,pass);
    }

    //POST
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    //PATCH
    @PatchMapping
    public void update(@RequestBody Usuario usuario){
        usuarioService.update(usuario);
    }

    //DELETE
    @DeleteMapping
    public void delete(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
    }
}
