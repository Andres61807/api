package tfg.proy.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;


@Entity
@Table(name="libro_genero")
public class LibroGenero {

    @EmbeddedId
    private LibroGeneroId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("libroId")
    @JoinColumn(name="id_libro")
    @JsonIgnoreProperties({"generos", "autores", "idiomas", "editoriales"})
    private Libro libro;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("generoId")
    @JoinColumn(name="id_genero")
    @JsonIgnoreProperties("libros")
    private Genero genero;

    public LibroGenero() {
    }

    public LibroGenero(LibroGeneroId id, Libro libro, Genero genero) {
        this.id = id;
        this.libro = libro;
        this.genero = genero;
    }

    public LibroGeneroId getId() {
        return id;
    }

    public void setId(LibroGeneroId id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
