package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfg.proy.api.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Usuario findByEmailAndPassword(String email,String password);
    Usuario findByEmailOrUsuario(String email,String usuario);
    
} 
