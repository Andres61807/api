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

    //comrpobar si un correo o usuario ya esta en uso
    @GetMapping("/comprobacion/{usuario}")
    public Boolean get(@PathVariable String usuario){
        
        if(usuarioService.get(usuario)!=null){
            return true;
        }
        return false;
    }
    
    //comprobar credenciales de registro de un usuario  
    @GetMapping("/login/{usuario}/{contraseña}")
    public Usuario get(@PathVariable String usuario,@PathVariable String contraseña){
        return usuarioService.get(usuario);
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
