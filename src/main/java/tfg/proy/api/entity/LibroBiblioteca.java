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
@Table(name="libro_biblioteca")
public class LibroBiblioteca {

    @EmbeddedId
    private LibroBibliotecaId libroBibliotecaId;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("libroId")
    @JoinColumn(name="id_libro")
    @JsonIgnoreProperties({"generos", "autores", "idiomas", "editoriales"})
    private Libro libro;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("bibliotecaId")
    @JoinColumn(name="id_biblioteca")
    @JsonIgnoreProperties("libros")
    private Biblioteca biblioteca;

    public LibroBiblioteca() {
    }

    public LibroBiblioteca(LibroBibliotecaId libroBibliotecaId, Libro libro, Biblioteca biblioteca) {
        this.libroBibliotecaId = libroBibliotecaId;
        this.libro = libro;
        this.biblioteca = biblioteca;
    }

    public LibroBibliotecaId getLibroBibliotecaId() {
        return libroBibliotecaId;
    }

    public void setLibroBibliotecaId(LibroBibliotecaId libroBibliotecaId) {
        this.libroBibliotecaId = libroBibliotecaId;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    
}
