package tfg.proy.api.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_usuario")
    private int id;
    private String nombre;
    private String apellidos;
    @Column(unique = true)
    private String usuario;
    @Column(unique = true)
    private String correo; 
    private String pass;
    private String semilla;
    private Date fecha_registro;
    private Date ultimo_registro;
    @OneToOne
    @JoinColumn(name="ID_biblioteca")
    private Biblioteca biblioteca;
    @OneToOne(optional = true)
    @JoinColumn(name="ID_editorial")
    private Editorial editorial;

    public Usuario() {
    }
    public Usuario(int id, String nombre, String apellidos, String usuario, String correo, String pass, String semilla,
            Date fecha_registro, Date ultimo_registro, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.correo = correo;
        this.pass = pass;
        this.semilla = semilla;
        this.fecha_registro = fecha_registro;
        this.ultimo_registro = ultimo_registro;
        this.biblioteca = biblioteca;
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
    public Date getFecha_registro() {
        return fecha_registro;
    }
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    public Date getUltimo_registro() {
        return ultimo_registro;
    }
    public void setUltimo_registro(Date ultimo_registro) {
        this.ultimo_registro = ultimo_registro;
    }
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
}
