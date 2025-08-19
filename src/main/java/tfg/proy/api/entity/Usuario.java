package tfg.proy.api.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long id;
    private String nombre;
    private String apellidos;
    @Column(unique = true)
    private String usuario;
    @Column(unique = true)
    private String correo; 
    private String pass;
    private String semilla;
    private LocalDate fecha_registro;
    private LocalDate ultimo_registro;
    @OneToOne(optional = true,mappedBy = "usuarioFK" ,  fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"usuarioFK", "libros"})
    private Editorial editorial;
    @OneToOne(mappedBy = "usuario" ,  fetch = FetchType.EAGER)
    @JsonIgnoreProperties("usuario")
    private Biblioteca biblioteca;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellidos, String usuario, String correo, String pass, String semilla,
            LocalDate fecha_registro, LocalDate ultimo_registro, Editorial editorial,Biblioteca bilioteca) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.correo = correo;
        this.pass = pass;
        this.semilla = semilla;
        this.fecha_registro = fecha_registro;
        this.ultimo_registro = ultimo_registro;
        this.editorial = editorial;
        this.biblioteca=bilioteca;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSemilla() {
        return semilla;
    }

    public void setSemilla(String semilla) {
        this.semilla = semilla;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public LocalDate getUltimo_registro() {
        return ultimo_registro;
    }

    public void setUltimo_registro(LocalDate ultimo_registro) {
        this.ultimo_registro = ultimo_registro;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    
}
