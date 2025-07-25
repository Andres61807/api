package tfg.proy.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tfg.proy.api.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    
    Usuario findByCorreoAndPass(String email,String password);

    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario OR u.correo = :correo")
    Usuario findByCorreoOrUsuario(@Param("correo") String correo,@Param("usuario") String usuario);
    
    @Query("SELECT u FROM Usuario u WHERE (u.usuario = :usuarioOrCorreo OR u.correo = :usuarioOrCorreo) AND u.pass = :pass")
    Usuario findByUsuarioOrCorreoAndPass(@Param("usuarioOrCorreo") String usuarioOrCorreo, @Param("pass") String pass);
        
}
    
