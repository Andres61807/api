package tfg.proy.api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_genero")
    private Long id;
    @Column(unique = true)
    private String genero;
    @OneToMany(mappedBy="genero")
    private List<LibroGenero> libros;
    
    public Genero() {
    }
    public Genero(Long id, String genero, List<LibroGenero> libros) {
        this.id = id;
        this.genero = genero;
        this.libros = libros;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public List<LibroGenero> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroGenero> libros) {
        this.libros = libros;
    }
    
    
    
}
