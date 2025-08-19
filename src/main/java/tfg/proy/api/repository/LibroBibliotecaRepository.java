package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.LibroBiblioteca;
import tfg.proy.api.entity.LibroBibliotecaId;

@Repository
public interface LibroBibliotecaRepository  extends JpaRepository<LibroBiblioteca,LibroBibliotecaId>{

}
