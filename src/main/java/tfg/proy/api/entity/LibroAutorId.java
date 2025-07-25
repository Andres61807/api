package tfg.proy.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LibroAutorId implements Serializable {
    
    
    @Column(name="ID_libro")
    private Long libroId;  
    @Column(name="ID_autor")
    private Long autorId;
    
    public LibroAutorId() {
    }
    public LibroAutorId(Long libroId, Long autorId) {
        this.libroId = libroId;
        this.autorId = autorId;
    }
    public Long getLibroId() {
        return libroId;
    }
    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }
    public Long getAutorId() {
        return autorId;
    }
    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libroId == null) ? 0 : libroId.hashCode());
        result = prime * result + ((autorId == null) ? 0 : autorId.hashCode());
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
        LibroAutorId other = (LibroAutorId) obj;
        if (libroId == null) {
            if (other.libroId != null)
                return false;
        } else if (!libroId.equals(other.libroId))
            return false;
        if (autorId == null) {
            if (other.autorId != null)
                return false;
        } else if (!autorId.equals(other.autorId))
            return false;
        return true;
    }

    
}
