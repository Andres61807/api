package tfg.proy.api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_genero")
    private int id;
    private String genero;
    @OneToMany(mappedBy="genero")
    private List<LibroGenero> libros;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public List<LibroGenero> getLibro() {
        return libros;
    }
    public void setLibro(List<LibroGenero> libro) {
        this.libros = libro;
    }
    
    
}
