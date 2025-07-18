package tfg.proy.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="biblioteca")
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_biblioteca")
    private int id;
    private LocalDate ultimoRegistro;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getUltimoRegistro() {
        return ultimoRegistro;
    }
    public void setUltimoRegistro(LocalDate ultimoRegistro) {
        this.ultimoRegistro = ultimoRegistro;
    }

}
