package tfg.proy.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_libro")
    private long id;
    private String titulo;
    private String genero;
    private String autor;
    private String saga;
    private double precio;
    private boolean DRM;
    private boolean activo;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getSaga() {
        return saga;
    }
    public void setSaga(String saga) {
        this.saga = saga;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean getDRM() {
        return DRM;
    }
    public void setDRM(boolean dRM) {
        DRM = dRM;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo){
        this.activo=activo;
    }
}
