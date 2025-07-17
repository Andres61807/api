package tfg.proy.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libro_genero")
public class LibroGenero {

    @Id
    @ManyToOne
    @JoinColumn(name="ID_libro")
    private Libro libro;
    @Id
    @ManyToOne
    @JoinColumn(name="ID_genero")
    private Genero genero;

    public LibroGenero() {
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
