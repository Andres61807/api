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
@Table(name="autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_autor")
    private int id;
    private String nombre;
    private String apellidos;
    @OneToMany(mappedBy="autor")
    private List<LibroAutor> libros;
    
    public Autor() {
    }
    public Autor(int id, String nombre, String apellidos, List<LibroAutor> libros) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public List<LibroAutor> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroAutor> libros) {
        this.libros = libros;
    }
    


}
