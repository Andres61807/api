package tfg.proy.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LibroEditorialId implements Serializable {

    @Column(name="ID_libro")
    private String libroId; 
    @Column(name="ID_editorial")
    private Long editorialId;
    
    public LibroEditorialId() {
    }
    public LibroEditorialId(String libroId, Long editorialId) {
        this.libroId = libroId;
        this.editorialId = editorialId;
    }

    public String getLibroId() {
        return libroId;
    }
    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }
    public Long getEditorialId() {
        return editorialId;
    }
    public void setEditorialId(Long editorialId) {
        this.editorialId = editorialId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libroId == null) ? 0 : libroId.hashCode());
        result = prime * result + ((editorialId == null) ? 0 : editorialId.hashCode());
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
        LibroEditorialId other = (LibroEditorialId) obj;
        if (libroId == null) {
            if (other.libroId != null)
                return false;
        } else if (!libroId.equals(other.libroId))
            return false;
        if (editorialId == null) {
            if (other.editorialId != null)
                return false;
        } else if (!editorialId.equals(other.editorialId))
            return false;
        return true;
    }
    
    
    
}
