package tfg.proy.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="libro_edit")
public class LibroEditorial {

    @EmbeddedId
    private LibroEditorialId libroEditorialId;

    @ManyToOne
    @MapsId("libroId")
    @JoinColumn(name="ID_libro")
    private Libro libro;
    @ManyToOne
    @MapsId("editorialId")
    @JoinColumn(name="ID_editorial")
    private Editorial editorial;
    @Column(name="fecha_alta")
    private LocalDate fechaAlta;
    @Column(name="fecha_baja")
    private LocalDate fechaBaja;
    private boolean avtivo;
    private double ingreso;

    public LibroEditorial() {
    }
    public LibroEditorial(Libro libro, Editorial editorial, LocalDate fechaAlta, LocalDate fechaBaja, boolean avtivo,double ingreso) {
        this.libro = libro;
        this.editorial = editorial;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.avtivo = avtivo;
        this.ingreso=ingreso;
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
    public double getIngreso() {
        return ingreso;
    }
    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }
    
    
}
