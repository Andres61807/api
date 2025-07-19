package tfg.proy.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libro_edit")
public class LibroEditorial {

    @Id
    @ManyToOne
    @JoinColumn(name="ID_libro")
    private Libro libro;
    @Id
    @ManyToOne
    @JoinColumn(name="ID_editorial")
    private Editorial editorial;
    @Column(name="fecha_alta")
    private LocalDate fechaAlta;
    @Column(name="fecha_baja")
    private LocalDate fechaBaja;
    private boolean avtivo;

    public LibroEditorial() {
    }
    public LibroEditorial(Libro libro, Editorial editorial, LocalDate fechaAlta, LocalDate fechaBaja, boolean avtivo) {
        this.libro = libro;
        this.editorial = editorial;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.avtivo = avtivo;
    }


    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public LocalDate getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public boolean isAvtivo() {
        return avtivo;
    }
    public void setAvtivo(boolean avtivo) {
        this.avtivo = avtivo;
    }
    
    
}
