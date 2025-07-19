package tfg.proy.api.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="libro_genero")
public class LibroGenero implements Serializable{

    @EmbeddedId
    private LibroGeneroId id;

    @ManyToOne
    @MapsId("libroId")
    @JoinColumn(name="ID_libro")
    private Libro libro;
    @ManyToOne
    @MapsId("generoId")
    @JoinColumn(name="ID_genero")
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
