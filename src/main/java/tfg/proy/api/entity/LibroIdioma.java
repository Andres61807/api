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
@Table(name="libro_idioma")
public class LibroIdioma {

    @EmbeddedId
    private LibroIdiomaId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("libroId")
    @JoinColumn(name="id_libro")
    @JsonIgnoreProperties({"generos", "autores", "idiomas", "editoriales"})
    private Libro libro;


    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("idiomaId")
    @JoinColumn(name="id_idioma")
    @JsonIgnoreProperties("libros")
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
