package tfg.proy.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libro_autor")
public class LibroAutor {

    @Id
    @ManyToOne
    @JoinColumn(name="ID_libro")
    private Libro libro;
    @Id
    @ManyToOne
    @JoinColumn(name="ID_autor")
    private Autor autor;

    
    public LibroAutor() {
    }
    
    public LibroAutor(Libro libro, Autor autor) {
        this.libro = libro;
        this.autor = autor;
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
