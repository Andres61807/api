package tfg.proy.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Usuario;
import tfg.proy.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario get(int id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario get(Usuario usuario){
        return usuario;
    }
    
    public Usuario get(String usuario){
        return usuarioRepository.findByCorreoOrUsuario(usuario, usuario);
    }
     
    public Usuario create(Usuario usuario){
        return usuarioRepository.saveAndFlush(usuario);
    }

    public void update(Usuario usuario){
        //TODO - 
    }

    public void delete(Usuario usuario){
        //TODO - 
    }
}
