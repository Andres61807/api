package tfg.proy.api.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;



@Entity
@Table(name="libro_autor")
public class LibroAutor {

    @EmbeddedId
    private LibroAutorId libroAutorId;

    
    @ManyToOne
    @MapsId("libroId")
    @JoinColumn(name="ID_libro")
    private Libro libro;
    
    @ManyToOne
    @MapsId("autorId")
    @JoinColumn(name="ID_autor")
    private Autor autor;

    
    public LibroAutor() {
    }
    
    public LibroAutor(LibroAutorId libroAutorId,Libro libro, Autor autor) {
        this.libro = libro;
        this.autor = autor;
        this.libroAutorId=libroAutorId;
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

    public LibroAutorId getLibroAutorId() {
        return libroAutorId;
    }

    public void setLibroAutorId(LibroAutorId libroAutorId) {
        this.libroAutorId = libroAutorId;
    }
    
}
