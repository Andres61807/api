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
@Table(name="idioma")
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_idioma")
    private Long id;
    @Column(unique = true)
    private String idioma;
    @OneToMany(mappedBy = "idioma")
    private List<LibroIdioma> libros;
    
    public Idioma() {
    }
    public Idioma(Long id, String idioma, List<LibroIdioma> libros) {
        this.id = id;
        this.idioma = idioma;
        this.libros = libros;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public List<LibroIdioma> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroIdioma> libros) {
        this.libros = libros;
    }
    
}
