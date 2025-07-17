package tfg.proy.api.entity;

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
    private int id;
}
