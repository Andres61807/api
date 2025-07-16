package tfg.proy.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.proy.api.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

    
} 
