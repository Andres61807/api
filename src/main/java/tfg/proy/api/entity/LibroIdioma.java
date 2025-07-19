package tfg.proy.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libro_idioma")
public class LibroIdioma {

    @Id
    @ManyToOne
    @JoinColumn(name="ID_libro")
    private Libro libro;

    @Id
    @ManyToOne
    @JoinColumn(name="ID_idioma")
    private Idioma idioma;

    public LibroIdioma() {
    }
    public LibroIdioma(Libro libro, Idioma idioma) {
        this.libro = libro;
        this.idioma = idioma;
    }
    
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Idioma getIdioma() {
        return idioma;
    }
    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    
}   
