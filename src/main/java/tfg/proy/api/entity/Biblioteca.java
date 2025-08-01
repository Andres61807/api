package tfg.proy.api.entity;

import java.time.LocalDate;
import java.util.List;

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
@Table(name="biblioteca")
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_biblioteca")
    private Long id;
    
    private LocalDate ultimoRegistro;
    
    @OneToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "biblioteca",fetch = FetchType.EAGER)
    @JsonIgnoreProperties("biblioteca")
    private List<LibroBiblioteca> libros;
    
    public Biblioteca() {
    }
    public Biblioteca(Long id, LocalDate ultimoRegistro, Usuario usuario) {
        this.id = id;
        this.ultimoRegistro = ultimoRegistro;
        this.usuario = usuario;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getUltimoRegistro() {
        return ultimoRegistro;
    }
    public void setUltimoRegistro(LocalDate ultimoRegistro) {
        this.ultimoRegistro = ultimoRegistro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
