package tfg.proy.api.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="biblioteca")
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_biblioteca")
    private int id;
    @OneToOne(mappedBy = "ID_usuario")
    private Usuario usuario;
    private Date ultimoRegistro;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getUltimoRegistro() {
        return ultimoRegistro;
    }
    public void setUltimoRegistro(Date ultimoRegistro) {
        this.ultimoRegistro = ultimoRegistro;
    }

}
