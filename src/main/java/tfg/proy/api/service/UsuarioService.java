package tfg.proy.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfg.proy.api.entity.Usuario;
import tfg.proy.api.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario get(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario get(Usuario usuario){
        return usuario;
    }
    
    public Usuario getLogin(String usuario,String pass){
        return usuarioRepository.findByUsuarioOrCorreoAndPass(usuario, pass);
    }

    public Usuario getCredenciales(String usuario){
        return usuarioRepository.findByCorreoOrUsuario(usuario, usuario);
    }
     
    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario); 
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

    
}
