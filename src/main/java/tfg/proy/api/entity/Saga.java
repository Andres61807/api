package tfg.proy.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="saga")
public class Saga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_saga")
    private int id;
    private String saga;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSaga() {
        return saga;
    }
    public void setSaga(String saga) {
        this.saga = saga;
    }

    
}
