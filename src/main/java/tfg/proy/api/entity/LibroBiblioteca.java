package tfg.proy.api.entity;

import java.time.LocalDate;

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
    private Double precioCompra;
    private LocalDate fechaCompra;

    public LibroBiblioteca() {
    }

    

    public LibroBiblioteca(LibroBibliotecaId libroBibliotecaId, Libro libro, Biblioteca biblioteca, double precioCompra,
            LocalDate fechaCompra) {
        this.libroBibliotecaId = libroBibliotecaId;
        this.libro = libro;
        this.biblioteca = biblioteca;
        this.precioCompra = precioCompra;
        this.fechaCompra = fechaCompra;
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

    public double getPrecioCompra() {
        return precioCompra;
    }



    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }



    public LocalDate getFechaCompra() {
        return fechaCompra;
    }



    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    
}
