package tfg.proy.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Usuario;


@Service
public class UsuarioService {
    
    public Usuario get(int id){
        //TODO - 
        return new Usuario();
    }

    public Usuario get(Usuario usuario){
        //TODO - falta repo
        return new Usuario();
    }

    public void update(Usuario usuario){
        //TODO - 
    }

    public void delete(Usuario usuario){
        //TODO - 
    }
}
