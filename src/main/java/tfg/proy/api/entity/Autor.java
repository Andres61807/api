package tfg.proy.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_autor")
    private Long id;
    @Column(unique=true)
    private String nombreCompleto;
    @OneToMany(mappedBy="autor",fetch = FetchType.EAGER)
    @JsonIgnoreProperties("autor")
    private List<LibroAutor> libros;
    
    //constructores
    public Autor() {
    }
    public Autor(Long id, String nombre, List<LibroAutor> libros) {
        this.id = id;
        this.nombreCompleto = nombre;
        this.libros = libros;
    }

    //getter y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombre) {
        this.nombreCompleto = nombre;
    }
    
    public List<LibroAutor> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroAutor> libros) {
        this.libros = libros;
    }
    
    

}
