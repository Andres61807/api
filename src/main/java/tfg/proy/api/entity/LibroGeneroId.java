package tfg.proy.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LibroGeneroId implements Serializable {

    @Column(name="id_libro")
    private Long libroId;  
    @Column(name="id_genero")
    private Long generoId; 
    
    public LibroGeneroId() {
    }
    public LibroGeneroId(Long libroId, Long generoId) {
        this.libroId = libroId;
        this.generoId = generoId;
    }

   
    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public Long getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Long generoId) {
        this.generoId = generoId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libroId == null) ? 0 : libroId.hashCode());
        result = prime * result + ((generoId == null) ? 0 : generoId.hashCode());
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
        LibroGeneroId other = (LibroGeneroId) obj;
        if (libroId == null) {
            if (other.libroId != null)
                return false;
        } else if (!libroId.equals(other.libroId))
            return false;
        if (generoId == null) {
            if (other.generoId != null)
                return false;
        } else if (!generoId.equals(other.generoId))
            return false;
        return true;
    }

    
}
