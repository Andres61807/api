package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfg.proy.api.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    
    Usuario findByCorreoAndPassword(String email,String password);
    Usuario findByCorreoOrUsuario(String correo,String usuario);
     
} 
