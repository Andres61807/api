package tfg.proy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<Usuario> getCredenciales(@PathVariable String usuario){
        Usuario user=usuarioService.getCredenciales(usuario);
        if (user!=null)
            return ResponseEntity.ok(user);
        return ResponseEntity.notFound().build();
    }

    //comprobar los datos de login del usuario
    @GetMapping("/login")
    public  ResponseEntity<Usuario> getLogin(@RequestParam String usuario,@RequestParam String pass){
        Usuario user=usuarioService.getLogin(usuario,pass);
        if (user!=null)
            return ResponseEntity.ok(user);
        return ResponseEntity.notFound().build();
    }

    //POST
    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        if(usuario.getId()!=null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(usuarioService.create(usuario));
    }

    //PATCH
    @PatchMapping
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        if(usuario.getId()==null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(usuarioService.update(usuario));
    }

    //DELETE
    @DeleteMapping
    public void delete(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
    }
}
