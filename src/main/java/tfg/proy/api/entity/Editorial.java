package tfg.proy.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_editorial")
    private Long id;
    private String nombre;
    private String direccion;
    @Column(unique = true)
    private String correo;
    @Column(unique = true)
    private String telefono;
    private String contacto;
    @Column(unique = true)
    private String web;
    @OneToMany(mappedBy = "editorial")
    private List<LibroEditorial> libros;
    @OneToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name="id_usuario")
    @JsonIgnoreProperties("editorial")
    private Usuario usuarioFK;
    private String nif;
    
    public Editorial() {
    }
    public Editorial(Long id, String nombre, String direccion, String correo, String telefono, String contacto,
            String web,List<LibroEditorial> libros,String nif) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.contacto = contacto;
        this.web = web;
        this.libros=libros;
        this.nif=nif;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    public List<LibroEditorial> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroEditorial> libros) {
        this.libros = libros;
    }
    public Usuario getUsuarioFK() {
        return usuarioFK;
    }
    public void setUsuarioFK(Usuario usuarioFK) {
        this.usuarioFK = usuarioFK;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
}
