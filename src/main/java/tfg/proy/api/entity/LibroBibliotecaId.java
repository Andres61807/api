package tfg.proy.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LibroBibliotecaId implements Serializable{

    @Column(name="id_libro")
    private Long libroId;  

    @Column(name="id_biblioteca")
    private Long bibliotecaId;

    public LibroBibliotecaId() {
    }

    public LibroBibliotecaId(Long libroId, Long bibliotecaId) {
        this.libroId = libroId;
        this.bibliotecaId = bibliotecaId;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public Long getBibliotecaId() {
        return bibliotecaId;
    }

    public void setBibliotecaId(Long bibliotecaId) {
        this.bibliotecaId = bibliotecaId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libroId == null) ? 0 : libroId.hashCode());
        result = prime * result + ((bibliotecaId == null) ? 0 : bibliotecaId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LibroBibliotecaId other = (LibroBibliotecaId) obj;
        if (libroId == null) {
            if (other.libroId != null)
                return false;
        } else if (!libroId.equals(other.libroId))
            return false;
        if (bibliotecaId == null) {
            if (other.bibliotecaId != null)
                return false;
        } else if (!bibliotecaId.equals(other.bibliotecaId))
            return false;
        return true;
    }
    
    
}
